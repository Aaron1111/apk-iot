package org.eclipse.paho.android.sample.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import org.eclipse.paho.android.sample.R;
import org.eclipse.paho.android.sample.internal.Connections;

import java.util.Map;


public class PublishFragment extends Fragment  {

    Switch grip = null;
    private Connection connection;

    private int selectedQos = 0;
    private boolean retainValue = false;
    private String topic = "test";
    private String message = "Hello world";
    TextView tvProgressLabel;
    TextView tvProgressLabel2;
    TextView tvProgressLabel3;
    TextView tvProgressLabel4;
    private String number = "0";
    private String number2 = "0";
    private String number3 = "0";
    private String number4 = "0";
    private SeekBar bar1;
    private SeekBar bar2;
    private SeekBar bar3;
    private SeekBar bar4;


    public PublishFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Map<String, Connection> connections = Connections.getInstance(this.getActivity()).getConnections();
        connection = connections.get(this.getArguments().getString(ActivityConstants.CONNECTION_KEY));

        System.out.println("FRAGMENT CONNECTION: " + this.getArguments().getString(ActivityConstants.CONNECTION_KEY));
        System.out.println("NAME:" + connection.getId());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_publish, container, false);
//        EditText topicText = rootView.findViewById(R.id.topic);
//        EditText messageText = rootView.findViewById(R.id.message);
//        Spinner qos = rootView.findViewById(R.id.qos_spinner);
//        final Switch retain = rootView.findViewById(R.id.retain_switch);
//        topicText.setText(topic);
//
//        topicText.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//                topic = s.toString();
//            }
//        });
//
//        messageText.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//                message = s.toString();
//            }
//        });

//        qos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                selectedQos = Integer.parseInt(getResources().getStringArray(R.array.qos_options)[position]);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });
//
//        retain.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                retainValue = isChecked;
//            }
//        });
//
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter
//                .createFromResource(getActivity(), R.array.qos_options, android.R.layout.simple_spinner_item);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        qos.setAdapter(adapter);

        //perintah maju
        ImageView publishMaju = rootView.findViewById(R.id.publish_maju);
        publishMaju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    System.out.println("Publising: [topic: majuw message: " + message + ", QoS: " + selectedQos + ", Retain: " + retainValue +
                            "]");
                    ((MainActivity) getActivity()).publishMaju(connection, topic, number, selectedQos, retainValue);
                }
        });

        //perintah mundur
        ImageView publishMundur = rootView.findViewById(R.id.publish_mundur);
        publishMundur.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View v) {
                    System.out.println("Publising: [topic: mundurs message: " + message + ", QoS: " + selectedQos + ", Retain: " + retainValue +
                            "]");
                    ((MainActivity) getActivity()).publishMaju(connection, topic, number, selectedQos, retainValue);
                }
        });

        //perintah kiri
        ImageView publishKiri = rootView.findViewById(R.id.publish_kiri);
        publishKiri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    System.out.println("Publising: [topic: kiria message: " + message + ", QoS: " + selectedQos + ", Retain: " + retainValue +
                            "]");
                    ((MainActivity) getActivity()).publishMaju(connection, topic, number, selectedQos, retainValue);
                }
        });

        //perintah kanan
        ImageView publishKanan = rootView.findViewById(R.id.publish_kanan);
        publishKanan.setOnClickListener(new View.OnClickListener() {
    @Override
            public void onClick(View v) {
                    System.out.println("Publising: [topic: kanand message: " + message + ", QoS: " + selectedQos + ", Retain: " + retainValue +
                            "]");
                    ((MainActivity) getActivity()).publishMaju(connection, topic, number, selectedQos, retainValue);
                }
        });

        //perintah diagonal atas kanan
        ImageView publishDiagataskanan = rootView.findViewById(R.id.publish_diagataska);
        publishMaju.setOnClickListener(new View.OnClickListener() {
    @Override
            public void onClick(View v) {
                    System.out.println("Publising: [topic: diag1 message: " + message + ", QoS: " + selectedQos + ", Retain: " + retainValue +
                            "]");
                    ((MainActivity) getActivity()).publishMaju(connection, topic, number, selectedQos, retainValue);
                }
        });

        //perintah diagonal bawah kanan
        ImageView publishDiagbawahkanan = rootView.findViewById(R.id.publish_diagbawahka);
        publishMaju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    System.out.println("Publising: [topic: diag2 message: " + message + ", QoS: " + selectedQos + ", Retain: " + retainValue +
                            "]");
                    ((MainActivity) getActivity()).publishMaju(connection, topic, number, selectedQos, retainValue);
                }
        });

        //perintah diagonal atas kiri
        ImageView publishDiagataskiri = rootView.findViewById(R.id.publish_diagataski);
        publishMaju.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View v) {
            System.out.println("Publising: [topic: diag4 message: " + message + ", QoS: " + selectedQos + ", Retain: " + retainValue +
                    "]");
            ((MainActivity) getActivity()).publishMaju(connection, topic, number, selectedQos, retainValue);
        }   });

        //perintah diagonal bawah kiri
        ImageView publishDiagbawahkiri = rootView.findViewById(R.id.publish_diagbawahki);
        publishMaju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Publising: [topic: diag3 message: " + message + ", QoS: " + selectedQos + ", Retain: " + retainValue +
                        "]");
                ((MainActivity) getActivity()).publishMaju(connection, topic, number, selectedQos, retainValue);
            }  });



        // set a change listener on the SeekBar, seekbar untuk mengatur servo1
        bar2 = rootView.findViewById(R.id.seekBar2);
        bar2.setOnSeekBarChangeListener(seekBarChangeListener);

        // set a change listener on the SeekBar, seekbar untuk mengatur servo2
        bar3 = rootView.findViewById(R.id.seekBar3);
        bar3.setOnSeekBarChangeListener(seekBarChangeListener);

        // set a change listener on the SeekBar, seekbar untuk mengatur servo3
        bar4 = rootView.findViewById(R.id.seekBar4);
        bar4.setOnSeekBarChangeListener(seekBarChangeListener);


        int progress2 = bar2.getProgress();
        tvProgressLabel2 = rootView.findViewById(R.id.textView2);
        tvProgressLabel2.setText("" + progress2);

        int progress3 = bar3.getProgress();
        tvProgressLabel3 = rootView.findViewById(R.id.textView3);
        tvProgressLabel3.setText("" + progress3);

        int progress4 = bar4.getProgress();
        tvProgressLabel4 = rootView.findViewById(R.id.textView4);
        tvProgressLabel4.setText("" + progress4);

        // Inflate the layout for this fragment
        return rootView;
    }

    //update seekbar kecepatan dan servo
    SeekBar.OnSeekBarChangeListener seekBarChangeListener = new SeekBar.OnSeekBarChangeListener() {

        @Override
        public void onProgressChanged(SeekBar bar, int progress, boolean fromUser) {

            //servo1
            if (bar.equals(bar2)) {
                // updated continuously as the user slides the thumb
                tvProgressLabel2.setText("" + progress);
                number2 = tvProgressLabel2.getText().toString();
            }
            //servo2
            if (bar.equals(bar3)) {
                // updated continuously as the user slides the thumb
                tvProgressLabel3.setText("" + progress);
                number3 = tvProgressLabel3.getText().toString();
            }
            //servo3
            else if (bar.equals(bar4)) {
                // updated continuously as the user slides the thumb
                tvProgressLabel4.setText("" + progress);
                number4 = tvProgressLabel4.getText().toString();
            }

        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // called when the user first touches the SeekBar
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // called after the user finishes moving the SeekBar
            if (seekBar.equals(bar2)) {

                ((MainActivity) getActivity()).bar1(connection, topic, number2, selectedQos, retainValue);
            }

            if (seekBar.equals(bar3)) {

                ((MainActivity) getActivity()).bar2(connection, topic, number3, selectedQos, retainValue);
            }

            if (seekBar.equals(bar4)) {

                ((MainActivity) getActivity()).bar3(connection, topic, number4, selectedQos, retainValue);
            }

        }
    };

}