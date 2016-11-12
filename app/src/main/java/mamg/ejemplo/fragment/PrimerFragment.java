package mamg.ejemplo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrador on 11/11/2016.
 */
public class PrimerFragment extends Fragment {
    public PrimerFragment(){

    }
         public static PrimerFragment getInstance(){
             PrimerFragment fragment = new PrimerFragment();
             return fragment;

         }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.primer_fragment_layout,container, false);
        return view;
    }
}
