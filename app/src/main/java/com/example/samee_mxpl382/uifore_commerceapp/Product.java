package com.example.samee_mxpl382.uifore_commerceapp;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;

public class Product implements Parcelable {
    String img;
    String ptitle;
    int price;
    String desc;

    public Product() {
    }

    public Product(String img, String ptitle, int price, String desc) {
        this.img = img;
        this.ptitle = ptitle;
        this.price = price;
        this.desc = desc;
    }


    protected Product(Parcel in) {
        img = in.readString();
        ptitle = in.readString();
        price = in.readInt();
        desc = in.readString();
    }

    public static final Creator<Product> CREATOR = new Creator<Product>() {
        @Override
        public Product createFromParcel(Parcel in) {
            return new Product(in);
        }

        @Override
        public Product[] newArray(int size) {
            return new Product[size];
        }
    };

    public ArrayList<Product> getProoduct(){

        ArrayList<Product> arrayList= new ArrayList<>();

        arrayList.add(new Product("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRcD64Hs91VkIn5NkcSbCu_N9lqetT7wGRHKkN_25ezhlnsJ67X","XYZ1",1501,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Gracchum patrem non beatiorem fuisse quam fillum, cum alter stabilire rem publicam studuerit, alter evertere. Nosti, credo, illud: Nemo pius est, qui pietatem-; Beatus autem esse in maximarum rerum timore nemo potest. Negat esse eam, inquit, propter se expetendam. Licet hic rursus ea commemores, quae optimis verbis ab Epicuro de laude amicitiae dicta sunt. Illis videtur, qui illud non dubitant bonum dicere "));
        arrayList.add(new Product("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTMUswRLFxfYYAWzBjyrVT0fS6Fql6v3bZfZgVS1RCnYJAk4F0l6w","XYZ2",1502,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Gracchum patrem non beatiorem fuisse quam fillum, cum alter stabilire rem publicam studuerit, alter evertere. Nosti, credo, illud: Nemo pius est, qui pietatem-; Beatus autem esse in maximarum rerum timore nemo potest. Negat esse eam, inquit, propter se expetendam. Licet hic rursus ea commemores, quae optimis verbis ab Epicuro de laude amicitiae dicta sunt. Illis videtur, qui illud non dubitant bonum dicere "));
        arrayList.add(new Product("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRhPDh3BVWf6b21AKsrkUL4etPw2_2bXJMHa1kj0a5qrm-lj-edZg","XYZ3",1503,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Gracchum patrem non beatiorem fuisse quam fillum, cum alter stabilire rem publicam studuerit, alter evertere. Nosti, credo, illud: Nemo pius est, qui pietatem-; Beatus autem esse in maximarum rerum timore nemo potest. Negat esse eam, inquit, propter se expetendam. Licet hic rursus ea commemores, quae optimis verbis ab Epicuro de laude amicitiae dicta sunt. Illis videtur, qui illud non dubitant bonum dicere "));
        arrayList.add(new Product("https://images.nike.com/is/image/DotCom/PDP_COPY/144801F_469/converse-chuck-taylor-all-star-high-top-unisex-shoe.jpg","XYZ4",1504,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Gracchum patrem non beatiorem fuisse quam fillum, cum alter stabilire rem publicam studuerit, alter evertere. Nosti, credo, illud: Nemo pius est, qui pietatem-; Beatus autem esse in maximarum rerum timore nemo potest. Negat esse eam, inquit, propter se expetendam. Licet hic rursus ea commemores, quae optimis verbis ab Epicuro de laude amicitiae dicta sunt. Illis videtur, qui illud non dubitant bonum dicere "));
        arrayList.add(new Product("https://i.ebayimg.com/images/g/0zsAAOSw0g1ajuTF/s-l300.jpg","XYZ5",1505,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Gracchum patrem non beatiorem fuisse quam fillum, cum alter stabilire rem publicam studuerit, alter evertere. Nosti, credo, illud: Nemo pius est, qui pietatem-; Beatus autem esse in maximarum rerum timore nemo potest. Negat esse eam, inquit, propter se expetendam. Licet hic rursus ea commemores, quae optimis verbis ab Epicuro de laude amicitiae dicta sunt. Illis videtur, qui illud non dubitant bonum dicere "));
        return arrayList;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getPtitle() {
        return ptitle;
    }

    public void setPtitle(String ptitle) {
        this.ptitle = ptitle;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(img);
        dest.writeString(ptitle);
        dest.writeInt(price);
        dest.writeString(desc);
    }
}
