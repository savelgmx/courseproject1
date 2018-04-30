    package com.example.administrator.courseproject1;

    import android.os.Bundle;
    import android.support.v7.app.AppCompatActivity;
    import android.view.View;
    import android.webkit.WebView;
    import android.widget.Button;
    import android.widget.TextView;

    /**
     * Created by Administrator on 25.04.2018.
     */

    public class SecondActivity extends AppCompatActivity{

        public static final String MAIN_EDITTEXT_KEY="MAIN_EDITTEXT_KEY";

        private WebView webView;
        private TextView mTextView;
        private Button mButtonTwo;

        private String mButtonTwoText;
        private String webViewSearchPage;

        //-----обработка нажатия на кнопки
        private View.OnClickListener mOnButtonTwoClickListener;

        {
            mOnButtonTwoClickListener = new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {
                    //теперь webview
                   webView = (WebView) findViewById(R.id.webview);
                   webView.getSettings().setJavaScriptEnabled(true);
                    webViewSearchPage="https://www.google.com/search?q="+mTextView.getText();

                    webView.loadUrl(webViewSearchPage);//webView.loadUrl("http://www.google.com");*/

                }

            };

        }


        @Override

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_two);
            mTextView =findViewById(R.id.tvTwo);
            mButtonTwo=findViewById(R.id.buttonTwo);

            Bundle bundle =getIntent().getExtras();
            mTextView.setText(bundle.getString(MAIN_EDITTEXT_KEY));//в нее будем записывать критерий поиска

            //изменим текст надписи на кнопке ButtonTwo
            mButtonTwoText=mButtonTwo.getText()+" "+mTextView.getText();
            mButtonTwo.setText(mButtonTwoText);


            mButtonTwo.setOnClickListener(mOnButtonTwoClickListener);


        }



    }

