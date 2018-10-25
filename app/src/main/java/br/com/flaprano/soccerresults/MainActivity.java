package br.com.flaprano.soccerresults;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setBtnActions();
    }

    private void setBtnActions() {
        setBtnResetCounters();
        setBtnIncrementCornerKicksTeamA();
        setBtnIncrementCornerKicksTeamB();
        setBtnIncrementFaultsTeamA();
        setBtnIncrementFaultsTeamB();
        setBtnIncrementGoalsTeamA();
        setBtnIncrementGoalsTeamB();
        setBtnIncrementPenaltiesTeamA();
        setBtnIncrementPenaltiesTeamB();
        setBtnIncrementRedCardsTeamA();
        setBtnIncrementRedCardsTeamB();
        setBtnIncrementYellowCardsTeamA();
        setBtnIncrementYellowCardsTeamB();
    }

    private void setBtnIncrementCornerKicksTeamA() {
        Button btnIncrementCornerKicksTeamA = (Button) findViewById(R.id.btnIncrementCornerKicksTeamA);
        btnIncrementCornerKicksTeamA.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                TextView txtCornerKicksCounterTeamA = (TextView) findViewById(R.id.txtCornerKicksCounterTeamA);
                int counter = Integer.parseInt(txtCornerKicksCounterTeamA.getText().toString()) + 1;
                txtCornerKicksCounterTeamA.setText(Integer.toString(counter));
            }
        });
    }

    private void setBtnIncrementCornerKicksTeamB() {
        Button btnIncrementCornerKicksTeamB = (Button) findViewById(R.id.btnIncrementCornerKicksTeamB);
        btnIncrementCornerKicksTeamB.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                TextView txtCornerKicksCounterTeamB = (TextView) findViewById(R.id.txtCornerKicksCounterTeamB);
                int counter = Integer.parseInt(txtCornerKicksCounterTeamB.getText().toString()) + 1;
                txtCornerKicksCounterTeamB.setText(Integer.toString(counter));
            }
        });
    }

    private void setBtnIncrementFaultsTeamA() {
        Button btnIncrementFaultsTeamA = (Button) findViewById(R.id.btnIncrementFaultsTeamA);
        btnIncrementFaultsTeamA.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                TextView txtFaultsCounterTeamA = (TextView) findViewById(R.id.txtFaultsCounterTeamA);
                int counter = Integer.parseInt(txtFaultsCounterTeamA.getText().toString()) + 1;
                txtFaultsCounterTeamA.setText(Integer.toString(counter));
            }
        });
    }

    private void setBtnIncrementFaultsTeamB() {
        Button btnIncrementFaultsTeamB = (Button) findViewById(R.id.btnIncrementFaultsTeamB);
        btnIncrementFaultsTeamB.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                TextView txtFaultsCounterTeamB = (TextView) findViewById(R.id.txtFaultsCounterTeamB);
                int counter = Integer.parseInt(txtFaultsCounterTeamB.getText().toString()) + 1;
                txtFaultsCounterTeamB.setText(Integer.toString(counter));
            }
        });
    }
    private void setBtnIncrementGoalsTeamA() {
        Button btnIncrementGoalsTeamA = (Button) findViewById(R.id.btnIncrementGoalsTeamA);
        btnIncrementGoalsTeamA.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                TextView txtGoalCounterTeamA = (TextView) findViewById(R.id.txtGoalCounterTeamA);
                int counter = Integer.parseInt(txtGoalCounterTeamA.getText().toString()) + 1;
                txtGoalCounterTeamA.setText(Integer.toString(counter));
            }
        });
    }
    private void setBtnIncrementGoalsTeamB() {
        Button btnIncrementGoalsTeamB = (Button) findViewById(R.id.btnIncrementGoalsTeamB);
        btnIncrementGoalsTeamB.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                TextView txtGoalCounterTeamB = (TextView) findViewById(R.id.txtGoalCounterTeamB);
                int counter = Integer.parseInt(txtGoalCounterTeamB.getText().toString()) + 1;
                txtGoalCounterTeamB.setText(Integer.toString(counter));
            }
        });
    }

    private void setBtnIncrementPenaltiesTeamA() {
        Button btnIncrementPenaltiesTeamA = (Button) findViewById(R.id.btnIncrementPenaltiesTeamA);
        btnIncrementPenaltiesTeamA.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                TextView txtPenaltiesCounterTeamA = (TextView) findViewById(R.id.txtPenaltiesCounterTeamA);
                int counter = Integer.parseInt(txtPenaltiesCounterTeamA.getText().toString()) + 1;
                txtPenaltiesCounterTeamA.setText(Integer.toString(counter));
            }
        });
    }

    private void setBtnIncrementPenaltiesTeamB() {
        Button btnIncrementPenaltiesTeamB = (Button) findViewById(R.id.btnIncrementPenaltiesTeamB);
        btnIncrementPenaltiesTeamB.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                TextView txtPenaltiesCounterTeamB = (TextView) findViewById(R.id.txtPenaltiesCounterTeamB);
                int counter = Integer.parseInt(txtPenaltiesCounterTeamB.getText().toString()) + 1;
                txtPenaltiesCounterTeamB.setText(Integer.toString(counter));
            }
        });
    }

    private void setBtnIncrementRedCardsTeamA() {
        Button btnIncrementRedCardsTeamA = (Button) findViewById(R.id.btnIncrementRedCardsTeamA);
        btnIncrementRedCardsTeamA.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                TextView txtRedCardsCounterTeamA = (TextView) findViewById(R.id.txtRedCardsCounterTeamA);
                int counter = Integer.parseInt(txtRedCardsCounterTeamA.getText().toString()) + 1;
                txtRedCardsCounterTeamA.setText(Integer.toString(counter));
            }
        });
    }

    private void setBtnIncrementRedCardsTeamB() {
        Button btnIncrementRedCardsTeamB = (Button) findViewById(R.id.btnIncrementRedCardsTeamB);
        btnIncrementRedCardsTeamB.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                TextView txtRedCardsCounterTeamB = (TextView) findViewById(R.id.txtRedCardsCounterTeamB);
                int counter = Integer.parseInt(txtRedCardsCounterTeamB.getText().toString()) + 1;
                txtRedCardsCounterTeamB.setText(Integer.toString(counter));
            }
        });
    }

    private void setBtnIncrementYellowCardsTeamA() {
        Button btnIncrementYellowCardsTeamA = (Button) findViewById(R.id.btnIncrementYellowCardsTeamA);
        btnIncrementYellowCardsTeamA.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                TextView txtYellowCardsCounterTeamA = (TextView) findViewById(R.id.txtYellowCardsCounterTeamA);
                int counter = Integer.parseInt(txtYellowCardsCounterTeamA.getText().toString()) + 1;
                txtYellowCardsCounterTeamA.setText(Integer.toString(counter));
            }
        });
    }

    private void setBtnIncrementYellowCardsTeamB() {
        Button btnIncrementYellowCardsTeamB = (Button) findViewById(R.id.btnIncrementYellowCardsTeamB);
        btnIncrementYellowCardsTeamB.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                TextView txtYellowCardsCounterTeamB = (TextView) findViewById(R.id.txtYellowCardsCounterTeamB);
                int counter = Integer.parseInt(txtYellowCardsCounterTeamB.getText().toString()) + 1;
                txtYellowCardsCounterTeamB.setText(Integer.toString(counter));
            }
        });
    }

    private void setBtnResetCounters() {
        Button btnResetCounters = (Button) findViewById(R.id.btnResetCounters);
        btnResetCounters.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                int initialCounter = 0;
                TextView txtYellowCardsCounterTeamA = (TextView) findViewById(R.id.txtYellowCardsCounterTeamA);
                txtYellowCardsCounterTeamA.setText(Integer.toString(initialCounter));

                TextView txtYellowCardsCounterTeamB = (TextView) findViewById(R.id.txtYellowCardsCounterTeamB);
                txtYellowCardsCounterTeamB.setText(Integer.toString(initialCounter));

                TextView txtRedCardsCounterTeamA = (TextView) findViewById(R.id.txtRedCardsCounterTeamA);
                txtRedCardsCounterTeamA.setText(Integer.toString(initialCounter));

                TextView txtRedCardsCounterTeamB = (TextView) findViewById(R.id.txtRedCardsCounterTeamB);
                txtRedCardsCounterTeamB.setText(Integer.toString(initialCounter));

                TextView txtPenaltiesCounterTeamA = (TextView) findViewById(R.id.txtPenaltiesCounterTeamA);
                txtPenaltiesCounterTeamA.setText(Integer.toString(initialCounter));

                TextView txtPenaltiesCounterTeamB = (TextView) findViewById(R.id.txtPenaltiesCounterTeamB);
                txtPenaltiesCounterTeamB.setText(Integer.toString(initialCounter));

                TextView txtGoalCounterTeamA = (TextView) findViewById(R.id.txtGoalCounterTeamA);
                txtGoalCounterTeamA.setText(Integer.toString(initialCounter));

                TextView txtGoalCounterTeamB = (TextView) findViewById(R.id.txtGoalCounterTeamB);
                txtGoalCounterTeamB.setText(Integer.toString(initialCounter));

                TextView txtFaultsCounterTeamA = (TextView) findViewById(R.id.txtFaultsCounterTeamA);
                txtFaultsCounterTeamA.setText(Integer.toString(initialCounter));

                TextView txtFaultsCounterTeamB = (TextView) findViewById(R.id.txtFaultsCounterTeamB);
                txtFaultsCounterTeamB.setText(Integer.toString(initialCounter));

                TextView txtCornerKicksCounterTeamA = (TextView) findViewById(R.id.txtCornerKicksCounterTeamA);
                txtCornerKicksCounterTeamA.setText(Integer.toString(initialCounter));

                TextView txtCornerKicksCounterTeamB = (TextView) findViewById(R.id.txtCornerKicksCounterTeamB);
                txtCornerKicksCounterTeamB.setText(Integer.toString(initialCounter));
            }
        });
    }
}
