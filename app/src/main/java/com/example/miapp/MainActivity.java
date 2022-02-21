package com.example.miapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mat1,mat2,mat3,mat4,mat5,mat6,mat7,mat8,mat9,mat10,reslt,par1mat1,par1mat2,par1mat3,par1mat4,par1mat5,par1mat6,par1mat7,par1mat8,par1mat9,par1mat10,par1reslt,par3mat1,par3mat2,par3mat3,par3mat4,par3mat5,par3mat6,par3mat7,par3mat8,par3mat9,par3mat10,par3reslt,semreslt,promat1,promat2,promat3,promat4,promat5,promat6,promat7,promat8,promat9,promat10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();


        mat1=(EditText)findViewById(R.id.txt_mat1);
        mat2=(EditText)findViewById(R.id.txt_mat2);
        mat3=(EditText)findViewById(R.id.txt_mat3);
        mat4=(EditText)findViewById(R.id.txt_mat4);
        mat5=(EditText)findViewById(R.id.txt_mat5);
        mat6=(EditText)findViewById(R.id.txt_mat6);
        mat7=(EditText)findViewById(R.id.txt_mat7);
        mat8=(EditText)findViewById(R.id.txt_mat8);
        mat9=(EditText)findViewById(R.id.txt_mat9);
        mat10=(EditText)findViewById(R.id.txt_mat10);


        par1mat1=(EditText)findViewById(R.id.par2_mat1);
        par1mat2=(EditText)findViewById(R.id.par2_mat2);
        par1mat3=(EditText)findViewById(R.id.par2_mat3);
        par1mat4=(EditText)findViewById(R.id.par2_mat4);
        par1mat5=(EditText)findViewById(R.id.par2_mat5);
        par1mat6=(EditText)findViewById(R.id.par2_mat6);
        par1mat7=(EditText)findViewById(R.id.par2_mat7);
        par1mat8=(EditText)findViewById(R.id.par2_mat8);
        par1mat9=(EditText)findViewById(R.id.par2_mat9);
        par1mat10=(EditText)findViewById(R.id.par2_mat10);


        par3mat1=(EditText)findViewById(R.id.par3_mat1);
        par3mat2=(EditText)findViewById(R.id.par3_mat2);
        par3mat3=(EditText)findViewById(R.id.par3_mat3);
        par3mat4=(EditText)findViewById(R.id.par3_mat4);
        par3mat5=(EditText)findViewById(R.id.par3_mat5);
        par3mat6=(EditText)findViewById(R.id.par3_mat6);
        par3mat7=(EditText)findViewById(R.id.par3_mat7);
        par3mat8=(EditText)findViewById(R.id.par3_mat8);
        par3mat9=(EditText)findViewById(R.id.par3_mat9);
        par3mat10=(EditText)findViewById(R.id.par3_mat10);

        promat1=(EditText)findViewById(R.id.pro_mat1);
        promat2=(EditText)findViewById(R.id.pro_mat2);
        promat3=(EditText)findViewById(R.id.pro_mat3);
        promat4=(EditText)findViewById(R.id.pro_mat4);
        promat5=(EditText)findViewById(R.id.pro_mat5);
        promat6=(EditText)findViewById(R.id.pro_mat6);
        promat7=(EditText)findViewById(R.id.pro_mat7);
        promat8=(EditText)findViewById(R.id.pro_mat8);
        promat9=(EditText)findViewById(R.id.pro_mat9);
        promat10=(EditText)findViewById(R.id.pro_mat10);


        reslt=(EditText)findViewById(R.id.txt_result_1par);
        par1reslt=(EditText)findViewById(R.id.txt_result_2par);
        par3reslt=(EditText)findViewById(R.id.txt_result_3par);
        semreslt=(EditText)findViewById(R.id.txt_result_semestre);


    }

    public void promedio(View view){
        String materia1 = mat1.getText().toString();
        String materia2 = mat2.getText().toString();
        String materia3 = mat3.getText().toString();
        String materia4 = mat4.getText().toString();
        String materia5 = mat5.getText().toString();
        String materia6 = mat6.getText().toString();
        String materia7 = mat7.getText().toString();
        String materia8 = mat8.getText().toString();
        String materia9 = mat9.getText().toString();
        String materia10 = mat10.getText().toString();

        String par1materia1 = par1mat1.getText().toString();
        String par1materia2 = par1mat2.getText().toString();
        String par1materia3 = par1mat3.getText().toString();
        String par1materia4 = par1mat4.getText().toString();
        String par1materia5 = par1mat5.getText().toString();
        String par1materia6 = par1mat6.getText().toString();
        String par1materia7 = par1mat7.getText().toString();
        String par1materia8 = par1mat8.getText().toString();
        String par1materia9 = par1mat9.getText().toString();
        String par1materia10 = par1mat10.getText().toString();

        String par3materia1 = par3mat1.getText().toString();
        String par3materia2 = par3mat2.getText().toString();
        String par3materia3 = par3mat3.getText().toString();
        String par3materia4 = par3mat4.getText().toString();
        String par3materia5 = par3mat5.getText().toString();
        String par3materia6 = par3mat6.getText().toString();
        String par3materia7 = par3mat7.getText().toString();
        String par3materia8 = par3mat8.getText().toString();
        String par3materia9 = par3mat9.getText().toString();
        String par3materia10 = par3mat10.getText().toString();



        double mate1 = Double.parseDouble(materia1);
        double mate2 = Double.parseDouble(materia2);
        double mate3 = Double.parseDouble(materia3);
        double mate4 = Double.parseDouble(materia4);
        double mate5 = Double.parseDouble(materia5);
        double mate6 = Double.parseDouble(materia6);
        double mate7 = Double.parseDouble(materia7);
        double mate8 = Double.parseDouble(materia8);
        double mate9 = Double.parseDouble(materia9);
        double mate10 = Double.parseDouble(materia10);

        double par1mate1 = Double.parseDouble(par1materia1);
        double par1mate2 = Double.parseDouble(par1materia2);
        double par1mate3 = Double.parseDouble(par1materia3);
        double par1mate4 = Double.parseDouble(par1materia4);
        double par1mate5 = Double.parseDouble(par1materia5);
        double par1mate6 = Double.parseDouble(par1materia6);
        double par1mate7 = Double.parseDouble(par1materia7);
        double par1mate8 = Double.parseDouble(par1materia8);
        double par1mate9 = Double.parseDouble(par1materia9);
        double par1mate10 = Double.parseDouble(par1materia10);

        double par3mate1 = Double.parseDouble(par3materia1);
        double par3mate2 = Double.parseDouble(par3materia2);
        double par3mate3 = Double.parseDouble(par3materia3);
        double par3mate4 = Double.parseDouble(par3materia4);
        double par3mate5 = Double.parseDouble(par3materia5);
        double par3mate6 = Double.parseDouble(par3materia6);
        double par3mate7 = Double.parseDouble(par3materia7);
        double par3mate8 = Double.parseDouble(par3materia8);
        double par3mate9 = Double.parseDouble(par3materia9);
        double par3mate10 = Double.parseDouble(par3materia10);




        double promedio1par = (mate1+mate2+mate3+mate4+mate5+mate6+mate7+mate8+mate9+mate10)/10;
        double promedio2par = (par1mate1+par1mate2+par1mate3+par1mate4+par1mate5+par1mate6+par1mate7+par1mate8+par1mate9+par1mate10)/10;
        double promedio3par = (par3mate1+par3mate2+par3mate3+par3mate4+par3mate5+par3mate6+par3mate7+par3mate8+par3mate9+par3mate10)/10;
        double promediosem = (promedio3par+promedio1par+promedio2par)/3;
        double promediomat1 = (mate1 + par1mate1 + par3mate1)/3;
        double promediomat2 = (mate2 + par1mate2 + par3mate2)/3;
        double promediomat3 = (mate3 + par1mate3 + par3mate3)/3;
        double promediomat4 = (mate4 + par1mate4 + par3mate4)/3;
        double promediomat5 = (mate5 + par1mate5 + par3mate5)/3;
        double promediomat6 = (mate6 + par1mate6 + par3mate6)/3;
        double promediomat7 = (mate7 + par1mate7 + par3mate7)/3;
        double promediomat8 = (mate8 + par1mate8 + par3mate8)/3;
        double promediomat9 = (mate9 + par1mate9 + par3mate9)/3;
        double promediomat10 = (mate10 + par1mate10 + par3mate10)/3;

        String resultmat1 = String.valueOf(promediomat1);
        String resultmat2 = String.valueOf(promediomat2);
        String resultmat3 = String.valueOf(promediomat3);
        String resultmat4 = String.valueOf(promediomat4);
        String resultmat5 = String.valueOf(promediomat5);
        String resultmat6 = String.valueOf(promediomat6);
        String resultmat7 = String.valueOf(promediomat7);
        String resultmat8 = String.valueOf(promediomat8);
        String resultmat9 = String.valueOf(promediomat9);
        String resultmat10 = String.valueOf(promediomat10);


        String result = String.valueOf(promedio1par);
        String resultpar2 = String.valueOf(promedio2par);
        String resultpar3 = String.valueOf(promedio3par);
        String semresult = String.valueOf(promediosem);


        reslt.setText(result);
        par1reslt.setText(resultpar2);
        par3reslt.setText(resultpar3);
        semreslt.setText(semresult);


        promat1.setText(resultmat1);
        promat2.setText(resultmat2);
        promat3.setText(resultmat3);
        promat4.setText(resultmat4);
        promat5.setText(resultmat5);
        promat6.setText(resultmat6);
        promat7.setText(resultmat7);
        promat8.setText(resultmat8);
        promat9.setText(resultmat9);
        promat10.setText(resultmat10);

    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();

    }




}
