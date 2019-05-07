package net.dedim.myapp1;

/**
 * The Functions created by Dedimoe on 05/08/19.
 */

public class AutonextfocusActivity extends BaseActivity {

    EditText etV1;
    EditText etV2;
    EditText etV3;
    EditText etV4;
    EditText etV5;
    EditText etV6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setHomepageBarColor();
        setContentView(R.layout.activity_autonextfocus);

        this.initComponents(); 
    }

    private void initComponents() {
        etV1 = (EditText) findViewById(R.id.etV1);
        etV2 = (EditText) findViewById(R.id.etV2);
        etV3 = (EditText) findViewById(R.id.etV3);
        etV4 = (EditText) findViewById(R.id.etV4);
        etV5 = (EditText) findViewById(R.id.etV5);
        etV6 = (EditText) findViewById(R.id.etV6);
        
        etV1.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {}
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                etV2.requestFocus();
            }
        });
        etV2.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {}
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                etV3.requestFocus();
            }
        });
        etV3.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {}
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                etV4.requestFocus();
            }
        });
        etV4.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {}
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                etV5.requestFocus();
            }
        });
        etV5.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {}
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                etV6.requestFocus();
            }
        });

    }
}
