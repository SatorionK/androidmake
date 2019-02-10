package com.websarva.wings.android.touhoulist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private ListView _lvMenu;
    private List<Map<String, Object>> _menuList;
    private static final String[] FROM = {"name", "ability"};
    private  static final int[] TO = {R.id.tvMenuName, R.id.tvMenuAbility};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _lvMenu = findViewById(R.id.lvMenu);
        _menuList =createHeros();

        SimpleAdapter adapter = new SimpleAdapter(MainActivity.this, _menuList, R.layout.row, FROM, TO);
        _lvMenu.setAdapter(adapter);
        _lvMenu.setOnItemClickListener(new ListItemClickListener());

    }


private class ListItemClickListener implements AdapterView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id){
            Map<String, Object> item = (Map<String, Object>) parent.getItemAtPosition(position);
            String menuName = (String) item.get("name");
            String Ability =  (String) item.get("ability");

            Intent intent = new Intent(MainActivity.this, MenuThanksActivity.class);
            intent.putExtra("meName",menuName);
            intent.putExtra("abil",Ability);

            startActivity(intent);
        }

}
























    private List<Map<String, Object>> createHeros(){
        List<Map<String,Object>> mList = new ArrayList<>();

        Map<String, Object> menu = new HashMap<>();
        menu.put("name","博麗霊夢");
        menu.put("ability","空を飛ぶ");
        menu.put("desc","夢想封印");
        mList.add(menu);

        menu = new HashMap<>();
        menu.put("name","霧雨魔理沙");
        menu.put("ability","魔法を使う");
        menu.put("desc","マスタースパーク");
        mList.add(menu);

        return mList;


    }










}
