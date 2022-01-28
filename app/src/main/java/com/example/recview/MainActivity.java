package com.example.recview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
//    Spinner spinner = findViewById(R.id.vibor);
//    String selected = spinner.getSelectedItem().toString();
    List<Item> items = new ArrayList<Item>();
    Boolean Chislitel = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView = findViewById(R.id.recycleview);

        GetData();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items ));

//        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//                String[] choose = getResources().getStringArray(R.array.vibor);
////                Toast toast = Toast.makeText(getApplicationContext(),
////                        "Ваш выбор: " + choose[i], Toast.LENGTH_SHORT);
////                toast.show();
////                if (choose[i]=="Числитель"){
////                    Chislitel=true;
////                }
////                else if (choose[i]=="Знаменатель"){
////                    Chislitel = false;
////                }
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> adapterView) {
//
//            }
//        });
    }


    private void GetData()
    {
        if(Chislitel == true) {
            items.add(new Item("Понедельник", "1. Пусто", R.drawable.color1,
                    "2. Разработка мобильных приложений", R.drawable.color2,
                    "3. Разработка программных модулей", R.drawable.color1,
                    "4. Технология разработки и защиты баз данных", R.drawable.color2,
                    "5. Инструментальные средства разработки ПО", R.drawable.color1
            ));

            items.add(new Item("Четверг", "1. Пусто", R.drawable.color1,
                    "2. Иностранный язык ", R.drawable.color1,
                    "3. Разработка мобильных приложений", R.drawable.color1,
                    "4. Технология разработки ПО", R.drawable.color1,
                    "5. Системное программирование", R.drawable.color1
            ));
            items.add(new Item("Пятница", "1. Физическая культура", R.drawable.color1,
                    "2. Разработка программных модулей", R.drawable.color1,
                    "3. Технология разработки ПО", R.drawable.color2,
                    "4. Технология разработки и защиты БД", R.drawable.color1,
                    "5. Пусто", R.drawable.color1
            ));
        }
        else {
            items.add(new Item("Понедельник", "1. Пусто", R.drawable.color1,
                    "2. Разработка программных модулей", R.drawable.color3,
                    "3. Разработка программных модулей", R.drawable.color1,
                    "4. Системное программирование", R.drawable.color3,
                    "5. Инструментальные средства разработки ПО", R.drawable.color1
            ));

            items.add(new Item("Четверг", "1. Пусто", R.drawable.color1,
                    "2. Иностранный язык ", R.drawable.color1,
                    "3. Разработка мобильных приложений", R.drawable.color1,
                    "4. Технология разработки ПО", R.drawable.color1,
                    "5. Системное программирование", R.drawable.color1
            ));
            items.add(new Item("Пятница", "1. Физическая культура", R.drawable.color1,
                    "2. Разработка программных модулей", R.drawable.color1,
                    "3. Инструментальные средства разработки ПО", R.drawable.color3,
                    "4. Технология разработки и защиты БД", R.drawable.color1,
                    "5. Пусто", R.drawable.color1
            ));
        }
    }
}