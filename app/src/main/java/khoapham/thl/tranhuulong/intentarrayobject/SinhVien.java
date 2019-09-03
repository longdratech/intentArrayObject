package khoapham.thl.tranhuulong.intentarrayobject;

import android.os.Parcel;
import android.os.Parcelable;

public class SinhVien implements Parcelable {
    String ten, lop;
    int tuoi;

   protected SinhVien(Parcel in){
       this.ten = in.readString();
       this.tuoi = in.readInt();
       this.lop = in.readString();

   }

    public SinhVien(String ten, String lop, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.lop = lop;

    }

    public static final Creator<SinhVien> CREATOR = new Creator<SinhVien>() {
        @Override
        public SinhVien createFromParcel(Parcel in) {
            return new SinhVien(in);
        }

        @Override
        public SinhVien[] newArray(int i) {
            return new SinhVien[i];
        }
    };
   //cái này
    @Override
    public int describeContents() {
        return hashCode();
    }
    //Thêm tất cả các thuộc tính vào Parcel, chỉ thêm thuộc tính nhưng chưa có value
    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(ten);
        parcel.writeInt(tuoi);
        parcel.writeString(lop);
    }

    public String getTen() {
        return ten;
    }
    public String getLop() {
        return lop;
    }
    public int getTuoi() {
        return tuoi;
    }

}
