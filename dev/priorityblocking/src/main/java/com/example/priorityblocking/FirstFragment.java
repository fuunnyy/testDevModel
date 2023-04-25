package com.example.priorityblocking;

import static java.lang.Thread.sleep;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.priorityblocking.databinding.FragmentFirstBinding;
import com.example.priorityblocking.priority.Task;

import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PriorityBlockingQueue<Task> tasks = new PriorityBlockingQueue<Task>(1 ,new Comparator<Task>(){
                    @Override
                    public int compare(Task o1, Task o2) {
                        return o1.getPriority() - o2.getPriority();
                    }
                });

                tasks.add(new Task(11));
                tasks.add(new Task(12));
                new Thread(() -> {
                    while (!tasks.isEmpty()){
                        Task poll = tasks.poll();
                        if (poll != null) {
                            poll.run();
                        }
                    }
                }).start();
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                tasks.add(new Task(23));
                tasks.add(new Task(3));
                tasks.add(new Task(4));
                tasks.add(new Task(12));


            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}