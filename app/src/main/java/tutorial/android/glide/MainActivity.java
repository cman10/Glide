package tutorial.android.glide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView load_image= (ImageView) findViewById(R.id.load_Image);
        Glide.with(this)
                .load("https://media.giphy.com/media/m80Q4HTDNPFHq/giphy.gif")
                .placeholder(R.drawable.placeholderimg)
                .error(R.drawable.error)
                .into(load_image);


    }
}
