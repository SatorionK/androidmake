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
        menu.put("desc","人間");
        mList.add(menu);

        menu = new HashMap<>();
        menu.put("name","霧雨魔理沙");
        menu.put("ability","魔法を使う");
        menu.put("desc","人間");
        mList.add(menu);

        menu = new HashMap<>();
        menu.put("name","十六夜咲夜");
        menu.put("ability","時間を操る");
        menu.put("desc","人間");
        mList.add(menu);

        menu = new HashMap<>();
        menu.put("name","魂魄妖夢");
        menu.put("ability","剣術を扱う");
        menu.put("desc","半人半霊");
        mList.add(menu);

        menu = new HashMap<>();
        menu.put("name","アリス・マーガトロイド");
        menu.put("ability","人形を操る");
        menu.put("desc","人間");
        mList.add(menu);

        menu = new HashMap<>();
        menu.put("name","射命丸文");
        menu.put("ability","風を操る");
        menu.put("desc","天狗");
        mList.add(menu);

        menu = new HashMap<>();
        menu.put("name","東風谷早苗");
        menu.put("ability","奇跡を起こす");
        menu.put("desc","人間");
        mList.add(menu);

        return mList;
    }

    private List<Map<String, Object>> createKouma(){
        List<Map<String,Object>> mList = new ArrayList<>();

        Map<String, Object> menu = new HashMap<>();
        menu.put("name","ルーミア");
        menu.put("ability","闇を操る");
        menu.put("desc","妖精");
        mList.add(menu);

        menu = new HashMap<>();
        menu.put("name","大妖精");
        menu.put("ability","不明");
        menu.put("desc","妖精");
        mList.add(menu);

        menu = new HashMap<>();
        menu.put("name","チルノ");
        menu.put("ability","冷気・氷を操る");
        menu.put("desc","妖精");
        mList.add(menu);

        menu = new HashMap<>();
        menu.put("name","紅美鈴");
        menu.put("ability","気を使う");
        menu.put("desc","妖怪");
        mList.add(menu);

        menu = new HashMap<>();
        menu.put("name","十六夜咲夜");
        menu.put("ability","時間を操る");
        menu.put("desc","人間");
        mList.add(menu);

        menu = new HashMap<>();
        menu.put("name","小悪魔");
        menu.put("ability","不明");
        menu.put("desc","悪魔");
        mList.add(menu);

        menu = new HashMap<>();
        menu.put("name","パチュリー・ノーレッジ");
        menu.put("ability","火水木金土日月を操る");
        menu.put("desc","魔法使い");
        mList.add(menu);

        menu = new HashMap<>();
        menu.put("name","レミリア・スカーレット");
        menu.put("ability","運命を操る");
        menu.put("desc","吸血鬼");
        mList.add(menu);

        menu = new HashMap<>();
        menu.put("name","レミリア・スカーレット");
        menu.put("ability","運命を操る");
        menu.put("desc","吸血鬼");
        mList.add(menu);

        return mList;
    }

    private List<Map<String, Object>> createYouyoumu(){
        List<Map<String,Object>> mList = new ArrayList<>();

        Map<String, Object> menu = new HashMap<>();
        menu.put("name","レティ・ホワイトロック");
        menu.put("ability","寒気を操る");
        menu.put("desc","妖精");
        mList.add(menu);

        menu = new HashMap<>();
        menu.put("name","橙");
        menu.put("ability","妖術を扱う");
        menu.put("desc","妖獣");
        mList.add(menu);

        menu = new HashMap<>();
        menu.put("name","アリス・マーガトロイド");
        menu.put("ability","人形を操る");
        menu.put("desc","人間");
        mList.add(menu);

        menu = new HashMap<>();
        menu.put("name","リリーホワイト");
        menu.put("ability","春が来たことを伝える");
        menu.put("desc","妖精");
        mList.add(menu);

        menu = new HashMap<>();
        menu.put("name","ルナサ・プリズムリバー");
        menu.put("ability","鬱の音を演奏する");
        menu.put("desc","妖精");
        mList.add(menu);

        menu = new HashMap<>();
        menu.put("name","メルラン・プリズムリバー");
        menu.put("ability","躁の音を演奏する");
        menu.put("desc","妖精");
        mList.add(menu);

        menu = new HashMap<>();
        menu.put("name","リリカ・プリズムリバー");
        menu.put("ability","幻想の音を演奏する");
        menu.put("desc","妖精");
        mList.add(menu);

        menu = new HashMap<>();
        menu.put("name","魂魄妖夢");
        menu.put("ability","剣術を扱う");
        menu.put("desc","半人半霊");
        mList.add(menu);

        menu = new HashMap<>();
        menu.put("name","西行寺幽々子");
        menu.put("ability","死を操る");
        menu.put("desc","亡霊");
        mList.add(menu);

        menu = new HashMap<>();
        menu.put("name","八雲藍");
        menu.put("ability","式神を操る");
        menu.put("desc","妖獣");
        mList.add(menu);

        menu = new HashMap<>();
        menu.put("name","八雲紫");
        menu.put("ability","境界を操る");
        menu.put("desc","妖怪");
        mList.add(menu);

        return mList;
    }

    private List<Map<String, Object>> createEiyasyou(){
        List<Map<String,Object>> mList = new ArrayList<>();

        Map<String, Object> menu = new HashMap<>();
        menu.put("name","リグル･ナイトバグ");
        menu.put("ability","蟲を操る");
        menu.put("desc","妖精");
        mList.add(menu);

        menu = new HashMap<>();
        menu.put("name","ミスティア・ローレライ");
        menu.put("ability","歌で人を惑わす");
        menu.put("desc","妖精");
        mList.add(menu);

        menu = new HashMap<>();
        menu.put("name","因幡てゐ");
        menu.put("ability","人間を幸運にする");
        menu.put("desc","妖獣");
        mList.add(menu);

        menu = new HashMap<>();
        menu.put("name","鈴仙・優曇華院・イナバ");
        menu.put("ability","狂気を操る程度");
        menu.put("desc","月人");
        mList.add(menu);

        menu = new HashMap<>();
        menu.put("name","八意永琳");
        menu.put("ability","あらゆる薬を作る");
        menu.put("desc","月人");
        mList.add(menu);

        menu = new HashMap<>();
        menu.put("name","蓬莱山輝夜");
        menu.put("ability","永遠と須臾を操る");
        menu.put("desc","月人");
        mList.add(menu);

        menu = new HashMap<>();
        menu.put("name","藤原妹紅");
        menu.put("ability","老いる事も死ぬ事も無い");
        menu.put("desc","人間（蓬莱人）");
        mList.add(menu);

        return mList;
    }




}
