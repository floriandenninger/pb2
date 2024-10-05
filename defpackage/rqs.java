package defpackage;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.barcode.Barcode;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rqs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int Q = qip.Q(parcel);
        String str = null;
        String str2 = null;
        Point[] pointArr = null;
        Barcode.Email email = null;
        Barcode.Phone phone = null;
        Barcode.Sms sms = null;
        Barcode.WiFi wiFi = null;
        Barcode.UrlBookmark urlBookmark = null;
        Barcode.GeoPoint geoPoint = null;
        Barcode.CalendarEvent calendarEvent = null;
        Barcode.ContactInfo contactInfo = null;
        Barcode.DriverLicense driverLicense = null;
        byte[] bArr = null;
        double d = 0.0d;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            switch (qip.M(readInt)) {
                case 2:
                    i = qip.O(parcel, readInt);
                    break;
                case 3:
                    str = qip.Y(parcel, readInt);
                    break;
                case 4:
                    str2 = qip.Y(parcel, readInt);
                    break;
                case 5:
                    i2 = qip.O(parcel, readInt);
                    break;
                case 6:
                    pointArr = (Point[]) qip.ai(parcel, readInt, Point.CREATOR);
                    break;
                case 7:
                    email = (Barcode.Email) qip.U(parcel, readInt, Barcode.Email.CREATOR);
                    break;
                case 8:
                    phone = (Barcode.Phone) qip.U(parcel, readInt, Barcode.Phone.CREATOR);
                    break;
                case 9:
                    sms = (Barcode.Sms) qip.U(parcel, readInt, Barcode.Sms.CREATOR);
                    break;
                case 10:
                    wiFi = (Barcode.WiFi) qip.U(parcel, readInt, Barcode.WiFi.CREATOR);
                    break;
                case 11:
                    urlBookmark = (Barcode.UrlBookmark) qip.U(parcel, readInt, Barcode.UrlBookmark.CREATOR);
                    break;
                case 12:
                    geoPoint = (Barcode.GeoPoint) qip.U(parcel, readInt, Barcode.GeoPoint.CREATOR);
                    break;
                case 13:
                    calendarEvent = (Barcode.CalendarEvent) qip.U(parcel, readInt, Barcode.CalendarEvent.CREATOR);
                    break;
                case 14:
                    contactInfo = (Barcode.ContactInfo) qip.U(parcel, readInt, Barcode.ContactInfo.CREATOR);
                    break;
                case 15:
                    driverLicense = (Barcode.DriverLicense) qip.U(parcel, readInt, Barcode.DriverLicense.CREATOR);
                    break;
                case 16:
                    bArr = qip.af(parcel, readInt);
                    break;
                case 17:
                    z = qip.ae(parcel, readInt);
                    break;
                case 18:
                    d = qip.K(parcel, readInt);
                    break;
                default:
                    qip.ad(parcel, readInt);
                    break;
            }
        }
        qip.ac(parcel, Q);
        return new Barcode(i, str, str2, i2, pointArr, email, phone, sms, wiFi, urlBookmark, geoPoint, calendarEvent, contactInfo, driverLicense, bArr, z, d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Barcode[i];
    }
}
