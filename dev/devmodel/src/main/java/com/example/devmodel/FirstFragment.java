package com.example.devmodel;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.devmodel.abstractFactory.AndroidFactory;
import com.example.devmodel.abstractFactory.Button;
import com.example.devmodel.abstractFactory.TextField;
import com.example.devmodel.adapter.WindowsMediaPlayer;
import com.example.devmodel.adapter.WindowsMediaPlayerAdapter;
import com.example.devmodel.agency.Proxy;
import com.example.devmodel.builder.Meal;
import com.example.devmodel.builder.MealA;
import com.example.devmodel.builder.MealBuilder;
import com.example.devmodel.builder.Waiter;
import com.example.devmodel.chain.ConcreteHandler1;
import com.example.devmodel.chain.ConcreteHandler2;
import com.example.devmodel.channel.Circle;
import com.example.devmodel.channel.Color;
import com.example.devmodel.channel.RedColor;
import com.example.devmodel.clone.AndroidWidget;
import com.example.devmodel.clone.Prototype;
import com.example.devmodel.command.ConcreteCommand1;
import com.example.devmodel.command.ConcreteCommand2;
import com.example.devmodel.command.Invoker;
import com.example.devmodel.command.Receiver;
import com.example.devmodel.complie.Folder;
import com.example.devmodel.complie.ImageFile;
import com.example.devmodel.complie.TextFile;
import com.example.devmodel.databinding.FragmentFirstBinding;
import com.example.devmodel.emblish.Component;
import com.example.devmodel.emblish.ConcreteComponent;
import com.example.devmodel.emblish.ConcreteDecorator;
import com.example.devmodel.factory.Factory;
import com.example.devmodel.factory.Product;
import com.example.devmodel.observer.ConcreteObserver;
import com.example.devmodel.observer.ConcreteSubject;
import com.example.devmodel.observer.Observer;
import com.example.devmodel.single.AndroidManager;
import com.example.devmodel.state.ConcreteStateA;
import com.example.devmodel.state.Context;
import com.example.devmodel.strategy.Contex;
import com.example.devmodel.strategy.OperationAdd;
import com.example.devmodel.strategy.OperationMultiply;
import com.example.devmodel.strategy.OperationSubstract;
import com.example.devmodel.temp.Cricket;
import com.example.devmodel.visitor.CountVisitor;
import com.example.devmodel.visitor.Dictory;
import com.example.devmodel.visitor.Element;
import com.example.devmodel.visitor.File;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
                testFactory();
            }
        });
        binding.buttonSecond.setOnClickListener((e) -> {
            testAbstractFactory();
        });
        binding.buttonThird.setOnClickListener(e -> {
            testBuilder();
        });
        binding.buttonFourth.setOnClickListener(e -> {
            testClone();
        });
        binding.buttonFiveth.setOnClickListener(e -> {
            testSingle();
        });
        binding.buttonSixth.setOnClickListener(e -> {
            testAdapter();
        });
        binding.buttonSivith.setOnClickListener(e -> {
            testChannel();
        });
        binding.buttonEighth.setOnClickListener(e -> {
            testCompile();
        });
        binding.buttonNinth.setOnClickListener(v -> {
            testEmblish();
        });
        binding.buttonTen.setOnClickListener(v->{
            testAgency();
        });
        binding.buttonEleven.setOnClickListener(v -> {
            testChain();
        });
        binding.buttonTwel.setOnClickListener(v -> {
            testCommand();
        });
        binding.buttonThirtheen.setOnClickListener(v -> {
            testObserve();
        });
        binding.buttonFourten.setOnClickListener(v -> {
            testState();
        });
        binding.buttonFivteen.setOnClickListener(v -> {
            testStrategy();
        });
        binding.buttonSixteen.setOnClickListener(v -> {
            testTemp();
        });
        binding.buttonSeventeen.setOnClickListener(v -> {
            testVisitor();
        });
    }

    private void testVisitor() {
        List<Element> elements = new ArrayList<>();
        elements.add(new File("file1"));
        elements.add(new File("file2"));
        elements.add(new Dictory(Arrays.asList(
                new File("file3"),
                new File("file4"),
                new Dictory(Collections.singletonList(new File("file5")))
        )));

        Dictory rootDirectory = new Dictory(elements);
        CountVisitor visitor = new CountVisitor();
        rootDirectory.accept(visitor);

        Log.e("visitor", "testVisitor: " + visitor.getFileCount());
        Log.e("visitor", "dictory count: " + visitor.getDirectoryCount());
    }

    private void testTemp() {
        Cricket cricket = new Cricket();
        cricket.play();
    }

    private void testStrategy() {
        Contex contex = new Contex(new OperationAdd());
        contex.executeStrategy(10, 5);

        Contex contex1 = new Contex(new OperationMultiply());
        contex1.executeStrategy(10, 5);

        Contex contex2 = new Contex(new OperationSubstract());
        contex2.executeStrategy(10, 5);
    }

    private void testState() {
        Context context = new Context(new ConcreteStateA());
        context.request();
        context.request();
        context.request();
        context.request();
    }

    private void testObserve() {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        ConcreteObserver concreteObserver1 = new ConcreteObserver();
        ConcreteObserver concreteObserver2 = new ConcreteObserver();

        concreteSubject.attach(concreteObserver1);
        concreteSubject.attach(concreteObserver2);

        concreteSubject.setState(1);
        concreteSubject.detach(concreteObserver1);
        concreteSubject.setState(2);
    }

    private void testCommand() {
        Receiver receiver = new Receiver();
        ConcreteCommand1 concreteCommand1 = new ConcreteCommand1(receiver);
        ConcreteCommand2 concreteCommand2 = new ConcreteCommand2(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(concreteCommand1);
        invoker.executeCommand();
        invoker.setCommand(concreteCommand2);
        invoker.executeCommand();
    }

    private void testChain() {
        ConcreteHandler1 concreteHandler1 = new ConcreteHandler1();
        ConcreteHandler2 concreteHandler2 = new ConcreteHandler2();
        concreteHandler1.setSuccessor(concreteHandler2);
        concreteHandler1.handleRequest(10);
    }

    private void testAgency() {
        Proxy proxy = new Proxy();
        proxy.request();
    }

    private void testEmblish() {
        Component component = new ConcreteComponent();
        ConcreteDecorator decorator = new ConcreteDecorator(component);
        decorator.operation();
    }

    private void testCompile() {
        Folder root = new Folder("root");
        Folder folder1 = new Folder("folder1");
        Folder folder2 = new Folder("folder2");
        root.addFile(folder1);
        root.addFile(folder2);
        TextFile textFile1 = new TextFile("textFile1.txt");
        ImageFile imageFile1 = new ImageFile("imageFile1.jpg");
        folder1.addFile(textFile1);
        folder1.addFile(imageFile1);
        root.display();
    }

    private void testChannel() {
        Circle circle = new Circle(new RedColor(), 10, 20, 30);
        circle.draw();
    }

    private void testAdapter() {
        WindowsMediaPlayer windowsMediaPlayer = new WindowsMediaPlayer();
        WindowsMediaPlayerAdapter windowsMediaPlayerAdapter = new WindowsMediaPlayerAdapter(windowsMediaPlayer);
        windowsMediaPlayerAdapter.play("music.mp3");
    }

    private void testSingle() {
        AndroidManager instance = AndroidManager.getInstance();
        instance.display();
    }

    /**
     * 工厂模式适用于需要动态创建对象的场景，例如根据用户输入的参数创建不同类型的对象。
     * 抽象工厂模式适用于需要创建一组相关或相互依赖的对象的场景，例如创建一个完整的UI组件库，其中按钮、标签和文本框等组件之间有依赖关系。
     */
    private void testFactory() {
        Product a = Factory.createProduct("A");
        a.operation();
    }

    private void testAbstractFactory() {
        AndroidFactory androidFactory = new AndroidFactory();
        Button button = androidFactory.createButton();
        TextField textField = androidFactory.createTextField();
        textField.display();
        button.display();
    }

    private void testBuilder() {
        Waiter waiter = new Waiter();
        MealA mealA = new MealA();
        waiter.setMealBuilder(mealA);
        Meal meal = waiter.getMeal();
        Log.e(MealBuilder.TAG, "testBuilder: " + meal.getDrink());
    }

    private void testClone() {
        AndroidWidget button = new AndroidWidget("button", 10);
        AndroidWidget clone = (AndroidWidget) button.clone();
        Log.e("clone", "testClone: " + clone.getType() + "button: " + button.getType());
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}