package com.example.scientificcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Math.cos;
import static java.lang.Math.exp;
import static java.lang.Math.log;
import static java.lang.Math.log10;
import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;
import static java.lang.Math.tan;

public class MainActivity extends AppCompatActivity {
    TextView display;
    EditText input;
    Button btnone,btntwo,btnthree,btnfour,btnfive,btnsix,btnseven,
            btneight,btnnine,btnsum,btnsub,btnmul,btndiv,btnzero,
            btndot,btncancel,btnequal,btnsquare,btnxpowy,btnlog,btnsin,
            btncos,btntan,btnsqrt,btnfact,btncube,btnln,btnexp;

    float value1,value2;
    boolean sum,sub,multi,div,power;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.input);
        btnone = findViewById(R.id.btnOne);
        btntwo = findViewById(R.id.btnTwo);
        btnthree = findViewById(R.id.btnThree);
        btnfour = findViewById(R.id.btnFour);
        btnfive = findViewById(R.id.btnFive);
        btnsix = findViewById(R.id.btnSix);
        btnseven = findViewById(R.id.btnSeven);
        btneight = findViewById(R.id.btnEight);
        btnnine = findViewById(R.id.btnNine);
        btnzero = findViewById(R.id.btnZero);
        btnsum = findViewById(R.id.btnSum);
        btnsub = findViewById(R.id.btnSub);
        btnmul = findViewById(R.id.btnMul);
        btndiv = findViewById(R.id.btnDiv);
        btndot = findViewById(R.id.btnDot);
        btnequal = findViewById(R.id.btnEqual);
        btnsquare = findViewById(R.id.btnsquare);
        btnlog = findViewById(R.id.btnlog);
        btnxpowy = findViewById(R.id.btnxpowy);
        btncube = findViewById(R.id.btncube);
        btnsqrt = findViewById(R.id.btnsqrt);
        btnsin = findViewById(R.id.btnsin);
        btncos = findViewById(R.id.btncos);
        btntan = findViewById(R.id.btntan);
        btnfact = findViewById(R.id.btnfact);
        btnln = findViewById(R.id.btnln);
        btnexp = findViewById(R.id.btnexp);
        btncancel = (Button)findViewById(R.id.btnClear);


        try {


            btnone.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    input.setText(input.getText() + "1");
                }
            });

            btntwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    input.setText(input.getText() + "2");
                }
            });

            btnthree.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    input.setText(input.getText() + "3");
                }
            });
            btnfour.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    input.setText(input.getText() + "4");
                }
            });
            btnfive.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    input.setText(input.getText() + "5");
                }
            });
            btnsix.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    input.setText(input.getText() + "6");
                }
            });
            btnseven.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    input.setText(input.getText() + "7");
                }
            });
            btneight.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    input.setText(input.getText() + "8");
                }
            });
            btnnine.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    input.setText(input.getText() + "9");
                }
            });
            btnzero.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    input.setText(input.getText() + "0");
                }
            });
            btndot.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    input.setText(input.getText() + ".");
                }
            });

            btnsum.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    value1 = Float.parseFloat(input.getText() + "");
                    sum = true;
                    input.setText(null);
                }
            });

            btnsub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    value1 = Float.parseFloat(input.getText() + "");
                    sub = true;
                    input.setText(null);
                }
            });
            btnmul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    value1 = Float.parseFloat(input.getText() + "");
                    multi = true;
                    input.setText(null);
                }
            });

            btndiv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    value1 = Float.parseFloat(input.getText() + "");
                    div = true;
                    input.setText(null);
                }
            });

            btnsin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    try {
                        value1 = Float.parseFloat(input.getText() + "");
                        double result = sin(value1);
                        input.setText(String.valueOf(result));

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });

            btncos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {

                        value1 = Float.parseFloat(input.getText() + "");
                        double result = cos(value1);
                        input.setText(String.valueOf(result));

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });

            btntan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {

                        value1 = Float.parseFloat(input.getText() + "");
                        double result = tan(value1);
                        input.setText(String.valueOf(result));

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });

            btnsqrt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {

                        value1 = Float.parseFloat(input.getText() + "");
                        double result = sqrt(value1);
                        input.setText(String.valueOf(result));

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });

            btncube.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {

                        value1 = Float.parseFloat(input.getText() + "");
                        double result = value1*value1*value1;
                        input.setText(String.valueOf(result));

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            btnexp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {

                        value1 = Float.parseFloat(input.getText() + "");
                        double result = exp(value1);
                        input.setText(String.valueOf(result));

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            btnln.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {

                        value1 = Float.parseFloat(input.getText() + "");
                        double result = log(value1);
                        input.setText(String.valueOf(result));

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });

            btnsquare.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {

                        value1 = Float.parseFloat(input.getText() + "");
                        double result = (value1 * value1);
                        input.setText(String.valueOf(result));

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });

            btnlog.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {

                        value1 = Float.parseFloat(input.getText() + "");
                        double result = log10(value1);
                        input.setText(String.valueOf(result));

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });

            btnfact.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {

                        value1 = Float.parseFloat(input.getText() + "");
                        double i = 1, fact = 1;
                        while (i <= value1) {
                            fact = fact * i;
                            i++;
                        }
                        input.setText(String.valueOf(fact));

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            btnxpowy.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    value1 = Float.parseFloat(input.getText() + "");
                    power = true;
                    input.setText(null);
                }
            });
            btncancel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    input.setText("");
                }
            });

            btnequal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    value2 = Float.parseFloat(input.getText() + "");

                    try{
                        if (sum == true) {
                            input.setText(value1 + value2 + "");
                            sum = false;
                        } else if (sub == true) {
                            input.setText(value1 - value2 + "");
                            sub = false;
                        } else if (multi == true) {
                            input.setText(value1 * value2 + "");
                            multi = false;
                        } else if (div == true) {
                            input.setText(value1 / value2 + "");
                            div = false;
                        } else if (power = true) {
                            input.setText(String.valueOf(pow(value1, value2)));
                            power = false;
                        }

                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            });


        }catch (Exception e){
            e.printStackTrace();
        }
    }



}




