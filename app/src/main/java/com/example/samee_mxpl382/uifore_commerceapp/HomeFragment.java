package com.example.samee_mxpl382.uifore_commerceapp;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }

    ViewPager vp;
    RecyclerView rv,rv2;
    ArrayList<Product> arrayList= new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        vp=view.findViewById(R.id.vp);
        rv=view.findViewById(R.id.rv);
        rv2=view.findViewById(R.id.rv2);
        vp.setAdapter(new vpAdapter(getContext()));
        arrayList.add(new Product("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRcD64Hs91VkIn5NkcSbCu_N9lqetT7wGRHKkN_25ezhlnsJ67X","XYZ1",1501,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Gracchum patrem non beatiorem fuisse quam fillum, cum alter stabilire rem publicam studuerit, alter evertere. Nosti, credo, illud: Nemo pius est, qui pietatem-; Beatus autem esse in maximarum rerum timore nemo potest. Negat esse eam, inquit, propter se expetendam. Licet hic rursus ea commemores, quae optimis verbis ab Epicuro de laude amicitiae dicta sunt. Illis videtur, qui illud non dubitant bonum dicere "));
        arrayList.add(new Product("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTMUswRLFxfYYAWzBjyrVT0fS6Fql6v3bZfZgVS1RCnYJAk4F0l6w","XYZ2",1502,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Gracchum patrem non beatiorem fuisse quam fillum, cum alter stabilire rem publicam studuerit, alter evertere. Nosti, credo, illud: Nemo pius est, qui pietatem-; Beatus autem esse in maximarum rerum timore nemo potest. Negat esse eam, inquit, propter se expetendam. Licet hic rursus ea commemores, quae optimis verbis ab Epicuro de laude amicitiae dicta sunt. Illis videtur, qui illud non dubitant bonum dicere "));
        arrayList.add(new Product("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRhPDh3BVWf6b21AKsrkUL4etPw2_2bXJMHa1kj0a5qrm-lj-edZg","XYZ3",1503,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Gracchum patrem non beatiorem fuisse quam fillum, cum alter stabilire rem publicam studuerit, alter evertere. Nosti, credo, illud: Nemo pius est, qui pietatem-; Beatus autem esse in maximarum rerum timore nemo potest. Negat esse eam, inquit, propter se expetendam. Licet hic rursus ea commemores, quae optimis verbis ab Epicuro de laude amicitiae dicta sunt. Illis videtur, qui illud non dubitant bonum dicere "));
        arrayList.add(new Product("https://images.nike.com/is/image/DotCom/PDP_COPY/144801F_469/converse-chuck-taylor-all-star-high-top-unisex-shoe.jpg","XYZ4",1504,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Gracchum patrem non beatiorem fuisse quam fillum, cum alter stabilire rem publicam studuerit, alter evertere. Nosti, credo, illud: Nemo pius est, qui pietatem-; Beatus autem esse in maximarum rerum timore nemo potest. Negat esse eam, inquit, propter se expetendam. Licet hic rursus ea commemores, quae optimis verbis ab Epicuro de laude amicitiae dicta sunt. Illis videtur, qui illud non dubitant bonum dicere "));
        arrayList.add(new Product("https://i.ebayimg.com/images/g/0zsAAOSw0g1ajuTF/s-l300.jpg","XYZ5",1505,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Gracchum patrem non beatiorem fuisse quam fillum, cum alter stabilire rem publicam studuerit, alter evertere. Nosti, credo, illud: Nemo pius est, qui pietatem-; Beatus autem esse in maximarum rerum timore nemo potest. Negat esse eam, inquit, propter se expetendam. Licet hic rursus ea commemores, quae optimis verbis ab Epicuro de laude amicitiae dicta sunt. Illis videtur, qui illud non dubitant bonum dicere "));

        rv.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        rv.setAdapter(new RecyclerViewAdapter(getContext(),arrayList));
        rv2.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        rv2.setAdapter(new RecyclerViewAdapter(getContext(),arrayList));
    }

    private class vpAdapter extends PagerAdapter {
        LayoutInflater layoutInflater;
        Context cxt;

        public vpAdapter(Context cxt) {
            this.cxt = cxt;
            layoutInflater=(LayoutInflater) cxt.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {

            return view==((LinearLayout)o);
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            View view=layoutInflater.inflate(R.layout.vp_item,container,false);
            ImageView iv=view.findViewById(R.id.iv);
            Picasso.get().load("http://www.linkcollider.com/img/bloggenerator/3/templatemo_200x100_banner.jpg").into(iv);
            container.addView(view);
            return view;
        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            container.removeView((LinearLayout) object);
        }
    }
}
