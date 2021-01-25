package Comment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.qnew.R;
import com.example.qnew.search.SearchAdapter;
import com.example.qnew.search.SearchData;

import java.util.ArrayList;
import java.util.List;

public class CommentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_comment );

        List<CommentData> results = new ArrayList<CommentData>();
        results.add(new CommentData("Comment", "https://vetmed.tamu.edu/news/wp-content/uploads/sites/9/2019/01/pettalk011719_450x300-300x200.jpg","jim",15,3));
        results.add(new CommentData("Comment", "https://vetmed.tamu.edu/news/wp-content/uploads/sites/9/2019/01/pettalk011719_450x300-300x200.jpg","jim",15,3));
        results.add(new CommentData("Comment", "https://vetmed.tamu.edu/news/wp-content/uploads/sites/9/2019/01/pettalk011719_450x300-300x200.jpg","jim",15,3));
        results.add(new CommentData("Comment", "https://vetmed.tamu.edu/news/wp-content/uploads/sites/9/2019/01/pettalk011719_450x300-300x200.jpg","jim",15,3));
        results.add(new CommentData("Comment", "https://vetmed.tamu.edu/news/wp-content/uploads/sites/9/2019/01/pettalk011719_450x300-300x200.jpg","jim",15,3));
        RecyclerView recyclerView = findViewById(R.id.rv_comment_recycleview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        CommentAdapter adapter = new CommentAdapter(results);
        recyclerView.setAdapter(adapter);
    }
}