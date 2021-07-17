package com.app.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button bt_1, bt_2, bt_3, bt_4, bt_5, bt_6, bt_7, bt_8, bt_9, bt_0, bt_ponto, bt_igual, bt_mais, bt_c, bt_menos, bt_div, bt_multi, bt_ce;
    TextView tv_resultado;

    //variavale para verificar qual sinal usado na operação matemática.
    private String sinal = "";
    private double valor1;
    private double valor2;
    //variavel para armazenar o resultado.
    private double resul;
    //verificador se o igual já foi precionado.
    private char igualPresionado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_resultado = findViewById(R.id.tv_resultado);

        bt_0 = findViewById(R.id.bt_0);
        bt_1 = findViewById(R.id.bt_1);
        bt_2 = findViewById(R.id.bt_2);
        bt_3 = findViewById(R.id.bt_3);
        bt_4 = findViewById(R.id.bt_4);
        bt_5 = findViewById(R.id.bt_5);
        bt_6 = findViewById(R.id.bt_6);
        bt_7 = findViewById(R.id.bt_7);
        bt_8 = findViewById(R.id.bt_8);
        bt_9 = findViewById(R.id.bt_9);
        bt_menos = findViewById(R.id.bt_menos);
        bt_mais = findViewById(R.id.bt_mais);
        bt_div = findViewById(R.id.bt_div);
        bt_multi = findViewById(R.id.bt_vezes);
        bt_igual = findViewById(R.id.bt_igual);
        bt_ce = findViewById(R.id.bt_c);
        bt_ponto = findViewById(R.id.bt_ponto);


        bt_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("".equals(sinal)) {
                    if (tv_resultado.getText().toString().equals("0") || tv_resultado.getText().toString().equals("0.0")) {
                        valor1 = 0;
                        tv_resultado.setText("0");
                    } else {
                        valor1 = Double.parseDouble(tv_resultado.getText().toString() + "0");
                        tv_resultado.setText(tv_resultado.getText().toString() + "0");
                    }

                } else {
                    if (tv_resultado.getText().toString().equals("0")) {
                        valor2 = 0;
                        tv_resultado.setText("0");
                    } else {
                        valor2 = Double.parseDouble(tv_resultado.getText().toString() + "0");
                        tv_resultado.setText(tv_resultado.getText().toString() + "0");
                    }


                    System.out.println("else");
                }
            }
        });

        bt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_resultado.getText().toString().equals("0") || tv_resultado.getText().toString().equals("0.0")) {
                    tv_resultado.setText("");
                }
                if ("".equals(sinal)) {
                    valor1 = Double.parseDouble(tv_resultado.getText().toString() + "1");

                } else {
                    valor2 = Double.parseDouble(tv_resultado.getText().toString() + "1");

                }
                tv_resultado.setText(tv_resultado.getText().toString() + "1");
            }
        });

        bt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_resultado.getText().toString().equals("0") || tv_resultado.getText().toString().equals("0.0")) {
                    tv_resultado.setText("");
                }
                if ("".equals(sinal)) {
                    valor1 = Double.parseDouble(tv_resultado.getText().toString() + "2");
                } else {
                    valor2 = Double.parseDouble(tv_resultado.getText().toString() + "2");

                }
                tv_resultado.setText(tv_resultado.getText().toString() + "2");
            }
        });

        bt_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_resultado.getText().toString().equals("0") || tv_resultado.getText().toString().equals("0.0")) {
                    tv_resultado.setText("");
                }
                if ("".equals(sinal)) {
                    valor1 = Double.parseDouble(tv_resultado.getText().toString() + "3");

                } else {
                    valor2 = Double.parseDouble(tv_resultado.getText().toString() + "3");

                }
                tv_resultado.setText(tv_resultado.getText().toString() + "3");
            }
        });

        bt_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_resultado.getText().toString().equals("0") || tv_resultado.getText().toString().equals("0.0")) {
                    tv_resultado.setText("");
                }
                if ("".equals(sinal)) {
                    valor1 = Double.parseDouble(tv_resultado.getText().toString() + "4");

                } else {
                    valor2 = Double.parseDouble(tv_resultado.getText().toString() + "4");

                }
                tv_resultado.setText(tv_resultado.getText().toString() + "4");
            }
        });

        bt_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_resultado.getText().toString().equals("0") || tv_resultado.getText().toString().equals("0.0")) {
                    tv_resultado.setText("");
                }
                if (tv_resultado.getText().toString().equals("0")) {
                    tv_resultado.setText("");
                }
                if ("".equals(sinal)) {
                    valor1 = Double.parseDouble(tv_resultado.getText().toString() + "5");

                } else {
                    valor2 = Double.parseDouble(tv_resultado.getText().toString() + "5");

                }
                tv_resultado.setText(tv_resultado.getText().toString() + "5");
                System.out.println("valor 1 = " + valor1 + "\nValor 2 = " + valor2);
            }
        });

        bt_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_resultado.getText().toString().equals("0") || tv_resultado.getText().toString().equals("0.0")) {
                    tv_resultado.setText("");
                }
                if ("".equals(sinal)) {
                    valor1 = Double.parseDouble(tv_resultado.getText().toString() + "6");

                } else {
                    valor2 = Double.parseDouble(tv_resultado.getText().toString() + "6");

                }
                tv_resultado.setText(tv_resultado.getText().toString() + "6");
            }
        });

        bt_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_resultado.getText().toString().equals("0") || tv_resultado.getText().toString().equals("0.0")) {
                    tv_resultado.setText("");
                }
                if ("".equals(sinal)) {
                    valor1 = Double.parseDouble(tv_resultado.getText().toString() + "7");

                } else {
                    valor2 = Double.parseDouble(tv_resultado.getText().toString() + "7");

                }
                tv_resultado.setText(tv_resultado.getText().toString() + "7");
            }
        });

        bt_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_resultado.getText().toString().equals("0") || tv_resultado.getText().toString().equals("0.0")) {
                    tv_resultado.setText("");
                }
                if ("".equals(sinal)) {
                    valor1 = Double.parseDouble(tv_resultado.getText().toString() + "8");

                } else {
                    valor2 = Double.parseDouble(tv_resultado.getText().toString() + "8");

                }
                tv_resultado.setText(tv_resultado.getText().toString() + "8");
            }
        });

        bt_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_resultado.getText().toString().equals("0") || tv_resultado.getText().toString().equals("0.0")) {
                    tv_resultado.setText("");
                }
                if ("".equals(sinal)) {
                    valor1 = Double.parseDouble(tv_resultado.getText().toString() + "9");

                } else {
                    valor2 = Double.parseDouble(tv_resultado.getText().toString() + "9");

                }
                tv_resultado.setText(tv_resultado.getText().toString() + "9");
            }
        });


        bt_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sinal = "*";
                tv_resultado.setText("");
                System.out.println("valor 1 = " + valor1 + "\nValor 2 = " + valor2);

            }
        });

        bt_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sinal = "/";
                tv_resultado.setText("");
                System.out.println("valor 1 = " + valor1 + "\nValor 2 = " + valor2);

            }
        });


        bt_mais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sinal = "+";
                tv_resultado.setText("");
                System.out.println("valor 1 = " + valor1 + "\nValor 2 = " + valor2);



            }
        });

        bt_menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sinal = "-";
                tv_resultado.setText("");
                System.out.println("valor 1 = " + valor1 + "\nValor 2 = " + valor2);

            }
        });


        bt_igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (valor1 == 0 && valor2 == 0) {
                    tv_resultado.setText("0");
                } else {
                    switch (sinal) {
                        case "+": {
                            if (igualPresionado != 's') {
                                resul = valor1 + valor2;
                            } else {
                                resul += valor2;
                            }
                            System.out.println("valor 1 = " + valor1 + "\nValor 2 = " + valor2);
                            tv_resultado.setText(String.valueOf((resul)));
                            break;
                        }
                        case "*": {
                            if (igualPresionado != 's') {
                                resul = valor1 * valor2;
                            } else {
                                resul *= valor2;
                            }
                            System.out.println("valor 1 = " + valor1 + "\nValor 2 = " + valor2);
                            tv_resultado.setText(String.valueOf((resul)));
                            break;
                        }
                        case "/": {
                            if (igualPresionado != 's') {
                                resul = valor1 / valor2;
                            } else {
                                resul /= valor2;
                            }
                            System.out.println("valor 1 = " + valor1 + "\nValor 2 = " + valor2);
                            tv_resultado.setText(String.valueOf((resul)));
                            break;
                        }
                        case "-": {
                            if (igualPresionado != 's') {
                                resul = valor1 - valor2;
                            } else {
                                resul -= valor2;
                            }
                            System.out.println("valor 1 = " + valor1 + "\nValor 2 = " + valor2);
                            tv_resultado.setText(String.valueOf((resul)));
                            break;
                        }
                    }
                }

                igualPresionado = 's';
            }
        });

        bt_ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor1 = 0;
                valor2 = 0;
                resul = 0;
                tv_resultado.setText("");
                sinal = "";
                igualPresionado = 'n';
            }
        });

        bt_ponto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = tv_resultado.getText().toString();
                char[] res1 = res.toCharArray();
                boolean temPonto = false;
                for (char c : res1) {
                    if (c == '.') {
                        temPonto = true;
                        break;
                    }
                }
                /*
                if(tv_resultado.getText().toString().equals("0")){
                    tv_resultado.setText("");
                }
                 */
                if (temPonto) {

                } else {
                    if (tv_resultado.getText().toString().equals("")) {
                        tv_resultado.setText("0.");
                    } else {
                        tv_resultado.setText(tv_resultado.getText().toString() + ".");
                    }
                }
            }
        });

    }
}