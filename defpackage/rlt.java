package defpackage;

import android.accounts.Account;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.mobiledataplan.MdpFlexTimeWindow;
import com.google.android.gms.mobiledataplan.MdpPurchaseOfferResponse;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferResponse;
import com.google.android.gms.mobiledataplan.MdpUpsellPlan;
import com.google.android.gms.mobiledataplan.WalletBalanceInfo;
import com.google.android.gms.mobiledataplan.carriersupport.CarrierSupportChannel;
import com.google.android.gms.mobiledataplan.carriersupport.CarrierSupportInfo;
import com.google.android.gms.mobiledataplan.consent.ConsentAgreementText;
import com.google.android.gms.mobiledataplan.consent.ConsentStatus;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationResponse;
import com.google.android.gms.mobiledataplan.consent.SafeHtml;
import com.google.android.gms.mobiledataplan.payment.PaymentForm;
import com.google.android.gms.mobstore.DeleteFileRequest;
import com.google.android.gms.mobstore.OpenFileDescriptorRequest;
import com.google.android.gms.mobstore.OpenFileDescriptorResponse;
import com.google.android.gms.mobstore.RenameRequest;
import com.google.android.gms.people.consentprimitive.ContactsConsentsCoarseStatus;
import com.google.android.gms.people.consentprimitive.ContactsConsentsConfig;
import com.google.android.gms.people.consentprimitive.ContactsConsentsDetailedStatus;
import com.google.android.gms.people.consentprimitive.ContactsConsentsStatus;
import com.google.android.gms.people.internal.MatrixCursorParcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rlt implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public rlt(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new MdpPurchaseOfferResponse[i];
            case 1:
                return new MdpFlexTimeWindow[i];
            case 2:
                return new MdpUpsellOfferResponse[i];
            case 3:
                return new MdpUpsellPlan[i];
            case 4:
                return new WalletBalanceInfo[i];
            case 5:
                return new CarrierSupportChannel[i];
            case 6:
                return new CarrierSupportInfo[i];
            case 7:
                return new ConsentAgreementText[i];
            case 8:
                return new ConsentStatus[i];
            case 9:
                return new GetConsentInformationResponse[i];
            case 10:
                return new SafeHtml[i];
            case 11:
                return new PaymentForm[i];
            case 12:
                return new DeleteFileRequest[i];
            case 13:
                return new OpenFileDescriptorRequest[i];
            case 14:
                return new OpenFileDescriptorResponse[i];
            case 15:
                return new RenameRequest[i];
            case 16:
                return new ContactsConsentsCoarseStatus[i];
            case 17:
                return new ContactsConsentsConfig[i];
            case 18:
                return new ContactsConsentsDetailedStatus[i];
            case 19:
                return new ContactsConsentsStatus[i];
            default:
                return new MatrixCursorParcelable[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        String str = null;
        MatrixCursor matrixCursor = null;
        ContactsConsentsCoarseStatus contactsConsentsCoarseStatus = null;
        Bundle bundle = null;
        ArrayList arrayList = null;
        Uri uri = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        Uri uri2 = null;
        Uri uri3 = null;
        String str2 = null;
        String str3 = null;
        switch (this.a) {
            case 0:
                int Q = qip.Q(parcel);
                long j = 0;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                Bundle bundle2 = null;
                Integer num = null;
                Long l = null;
                while (parcel.dataPosition() < Q) {
                    int readInt = parcel.readInt();
                    switch (qip.M(readInt)) {
                        case 1:
                            str4 = qip.Y(parcel, readInt);
                            break;
                        case 2:
                            str5 = qip.Y(parcel, readInt);
                            break;
                        case 3:
                            str6 = qip.Y(parcel, readInt);
                            break;
                        case 4:
                            str7 = qip.Y(parcel, readInt);
                            break;
                        case 5:
                            j = qip.R(parcel, readInt);
                            break;
                        case 6:
                            str8 = qip.Y(parcel, readInt);
                            break;
                        case 7:
                            str9 = qip.Y(parcel, readInt);
                            break;
                        case 8:
                            bundle2 = qip.S(parcel, readInt);
                            break;
                        case 9:
                            num = qip.W(parcel, readInt);
                            break;
                        case 10:
                            l = qip.X(parcel, readInt);
                            break;
                        default:
                            qip.ad(parcel, readInt);
                            break;
                    }
                }
                qip.ac(parcel, Q);
                return new MdpPurchaseOfferResponse(str4, str5, str6, str7, j, str8, str9, bundle2, num, l);
            case 1:
                int Q2 = qip.Q(parcel);
                String str10 = null;
                String str11 = null;
                while (parcel.dataPosition() < Q2) {
                    int readInt2 = parcel.readInt();
                    int M = qip.M(readInt2);
                    if (M == 1) {
                        str = qip.Y(parcel, readInt2);
                    } else if (M == 2) {
                        str10 = qip.Y(parcel, readInt2);
                    } else if (M == 3) {
                        str11 = qip.Y(parcel, readInt2);
                    } else if (M == 4) {
                        i = qip.O(parcel, readInt2);
                    } else {
                        qip.ad(parcel, readInt2);
                    }
                }
                qip.ac(parcel, Q2);
                return new MdpFlexTimeWindow(str, str10, str11, i);
            case 2:
                int Q3 = qip.Q(parcel);
                String str12 = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                MdpUpsellPlan[] mdpUpsellPlanArr = null;
                Bundle bundle3 = null;
                Integer num2 = null;
                Long l2 = null;
                PaymentForm[] paymentFormArr = null;
                while (parcel.dataPosition() < Q3) {
                    int readInt3 = parcel.readInt();
                    switch (qip.M(readInt3)) {
                        case 1:
                            str12 = qip.Y(parcel, readInt3);
                            break;
                        case 2:
                            str13 = qip.Y(parcel, readInt3);
                            break;
                        case 3:
                            str14 = qip.Y(parcel, readInt3);
                            break;
                        case 4:
                            str15 = qip.Y(parcel, readInt3);
                            break;
                        case 5:
                            mdpUpsellPlanArr = (MdpUpsellPlan[]) qip.ai(parcel, readInt3, MdpUpsellPlan.CREATOR);
                            break;
                        case 6:
                            bundle3 = qip.S(parcel, readInt3);
                            break;
                        case 7:
                            num2 = qip.W(parcel, readInt3);
                            break;
                        case 8:
                            l2 = qip.X(parcel, readInt3);
                            break;
                        case 9:
                            paymentFormArr = (PaymentForm[]) qip.ai(parcel, readInt3, PaymentForm.CREATOR);
                            break;
                        default:
                            qip.ad(parcel, readInt3);
                            break;
                    }
                }
                qip.ac(parcel, Q3);
                return new MdpUpsellOfferResponse(str12, str13, str14, str15, mdpUpsellPlanArr, bundle3, num2, l2, paymentFormArr);
            case 3:
                int Q4 = qip.Q(parcel);
                long j2 = 0;
                long j3 = 0;
                long j4 = 0;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                String str21 = null;
                String str22 = null;
                int i6 = 0;
                while (parcel.dataPosition() < Q4) {
                    int readInt4 = parcel.readInt();
                    switch (qip.M(readInt4)) {
                        case 1:
                            str16 = qip.Y(parcel, readInt4);
                            break;
                        case 2:
                            str17 = qip.Y(parcel, readInt4);
                            break;
                        case 3:
                            str18 = qip.Y(parcel, readInt4);
                            break;
                        case 4:
                            j2 = qip.R(parcel, readInt4);
                            break;
                        case 5:
                            str19 = qip.Y(parcel, readInt4);
                            break;
                        case 6:
                            str20 = qip.Y(parcel, readInt4);
                            break;
                        case 7:
                            j3 = qip.R(parcel, readInt4);
                            break;
                        case 8:
                            j4 = qip.R(parcel, readInt4);
                            break;
                        case 9:
                            str21 = qip.Y(parcel, readInt4);
                            break;
                        case 10:
                            str22 = qip.Y(parcel, readInt4);
                            break;
                        case 11:
                            i6 = qip.O(parcel, readInt4);
                            break;
                        default:
                            qip.ad(parcel, readInt4);
                            break;
                    }
                }
                qip.ac(parcel, Q4);
                return new MdpUpsellPlan(str16, str17, str18, j2, str19, str20, j3, j4, str21, str22, i6);
            case 4:
                int Q5 = qip.Q(parcel);
                long j5 = 0;
                String str23 = null;
                Long l3 = null;
                String str24 = null;
                String str25 = null;
                Long l4 = null;
                Long l5 = null;
                Long l6 = null;
                String str26 = null;
                int i7 = 0;
                while (parcel.dataPosition() < Q5) {
                    int readInt5 = parcel.readInt();
                    switch (qip.M(readInt5)) {
                        case 1:
                            j5 = qip.R(parcel, readInt5);
                            break;
                        case 2:
                            str23 = qip.Y(parcel, readInt5);
                            break;
                        case 3:
                            i7 = qip.O(parcel, readInt5);
                            break;
                        case 4:
                            l3 = qip.X(parcel, readInt5);
                            break;
                        case 5:
                            str24 = qip.Y(parcel, readInt5);
                            break;
                        case 6:
                            str25 = qip.Y(parcel, readInt5);
                            break;
                        case 7:
                            l4 = qip.X(parcel, readInt5);
                            break;
                        case 8:
                            l5 = qip.X(parcel, readInt5);
                            break;
                        case 9:
                            l6 = qip.X(parcel, readInt5);
                            break;
                        case 10:
                            str26 = qip.Y(parcel, readInt5);
                            break;
                        default:
                            qip.ad(parcel, readInt5);
                            break;
                    }
                }
                qip.ac(parcel, Q5);
                return new WalletBalanceInfo(j5, str23, i7, l3, str24, str25, l4, l5, l6, str26);
            case 5:
                int Q6 = qip.Q(parcel);
                String str27 = null;
                String str28 = null;
                String str29 = null;
                String str30 = null;
                String str31 = null;
                int i8 = 0;
                while (parcel.dataPosition() < Q6) {
                    int readInt6 = parcel.readInt();
                    switch (qip.M(readInt6)) {
                        case 1:
                            str27 = qip.Y(parcel, readInt6);
                            break;
                        case 2:
                            str28 = qip.Y(parcel, readInt6);
                            break;
                        case 3:
                            str29 = qip.Y(parcel, readInt6);
                            break;
                        case 4:
                            str30 = qip.Y(parcel, readInt6);
                            break;
                        case 5:
                            str31 = qip.Y(parcel, readInt6);
                            break;
                        case 6:
                            i8 = qip.O(parcel, readInt6);
                            break;
                        default:
                            qip.ad(parcel, readInt6);
                            break;
                    }
                }
                qip.ac(parcel, Q6);
                return new CarrierSupportChannel(str27, str28, str29, str30, str31, i8);
            case 6:
                int Q7 = qip.Q(parcel);
                String str32 = null;
                CarrierSupportChannel[] carrierSupportChannelArr = null;
                while (parcel.dataPosition() < Q7) {
                    int readInt7 = parcel.readInt();
                    int M2 = qip.M(readInt7);
                    if (M2 == 1) {
                        str3 = qip.Y(parcel, readInt7);
                    } else if (M2 == 2) {
                        str32 = qip.Y(parcel, readInt7);
                    } else if (M2 == 3) {
                        carrierSupportChannelArr = (CarrierSupportChannel[]) qip.ai(parcel, readInt7, CarrierSupportChannel.CREATOR);
                    } else {
                        qip.ad(parcel, readInt7);
                    }
                }
                qip.ac(parcel, Q7);
                return new CarrierSupportInfo(str3, str32, carrierSupportChannelArr);
            case 7:
                int Q8 = qip.Q(parcel);
                SafeHtml safeHtml = null;
                SafeHtml[] safeHtmlArr = null;
                SafeHtml[] safeHtmlArr2 = null;
                String str33 = null;
                String str34 = null;
                String str35 = null;
                String str36 = null;
                int i9 = 0;
                while (parcel.dataPosition() < Q8) {
                    int readInt8 = parcel.readInt();
                    switch (qip.M(readInt8)) {
                        case 1:
                            safeHtml = (SafeHtml) qip.U(parcel, readInt8, SafeHtml.CREATOR);
                            break;
                        case 2:
                            safeHtmlArr = (SafeHtml[]) qip.ai(parcel, readInt8, SafeHtml.CREATOR);
                            break;
                        case 3:
                            safeHtmlArr2 = (SafeHtml[]) qip.ai(parcel, readInt8, SafeHtml.CREATOR);
                            break;
                        case 4:
                            str33 = qip.Y(parcel, readInt8);
                            break;
                        case 5:
                            str34 = qip.Y(parcel, readInt8);
                            break;
                        case 6:
                            str35 = qip.Y(parcel, readInt8);
                            break;
                        case 7:
                            i9 = qip.O(parcel, readInt8);
                            break;
                        case 8:
                            str36 = qip.Y(parcel, readInt8);
                            break;
                        default:
                            qip.ad(parcel, readInt8);
                            break;
                    }
                }
                qip.ac(parcel, Q8);
                return new ConsentAgreementText(safeHtml, safeHtmlArr, safeHtmlArr2, str33, str34, str35, i9, str36);
            case 8:
                int Q9 = qip.Q(parcel);
                while (parcel.dataPosition() < Q9) {
                    int readInt9 = parcel.readInt();
                    if (qip.M(readInt9) == 1) {
                        i5 = qip.O(parcel, readInt9);
                    } else {
                        qip.ad(parcel, readInt9);
                    }
                }
                qip.ac(parcel, Q9);
                return new ConsentStatus(i5);
            case 9:
                int Q10 = qip.Q(parcel);
                Long l7 = 0L;
                ConsentStatus consentStatus = null;
                ConsentAgreementText consentAgreementText = null;
                Integer num3 = null;
                Long l8 = null;
                Integer num4 = null;
                while (parcel.dataPosition() < Q10) {
                    int readInt10 = parcel.readInt();
                    switch (qip.M(readInt10)) {
                        case 1:
                            consentStatus = (ConsentStatus) qip.U(parcel, readInt10, ConsentStatus.CREATOR);
                            break;
                        case 2:
                            consentAgreementText = (ConsentAgreementText) qip.U(parcel, readInt10, ConsentAgreementText.CREATOR);
                            break;
                        case 3:
                            l7 = qip.X(parcel, readInt10);
                            break;
                        case 4:
                            num3 = qip.W(parcel, readInt10);
                            break;
                        case 5:
                            l8 = qip.X(parcel, readInt10);
                            break;
                        case 6:
                            num4 = qip.W(parcel, readInt10);
                            break;
                        default:
                            qip.ad(parcel, readInt10);
                            break;
                    }
                }
                qip.ac(parcel, Q10);
                return new GetConsentInformationResponse(consentStatus, consentAgreementText, l7, num3, l8, num4);
            case 10:
                int Q11 = qip.Q(parcel);
                while (parcel.dataPosition() < Q11) {
                    int readInt11 = parcel.readInt();
                    if (qip.M(readInt11) == 1) {
                        str2 = qip.Y(parcel, readInt11);
                    } else {
                        qip.ad(parcel, readInt11);
                    }
                }
                qip.ac(parcel, Q11);
                return new SafeHtml(str2);
            case 11:
                int Q12 = qip.Q(parcel);
                while (parcel.dataPosition() < Q12) {
                    int readInt12 = parcel.readInt();
                    if (qip.M(readInt12) == 1) {
                        i4 = qip.O(parcel, readInt12);
                    } else {
                        qip.ad(parcel, readInt12);
                    }
                }
                qip.ac(parcel, Q12);
                return new PaymentForm(i4);
            case 12:
                int Q13 = qip.Q(parcel);
                while (parcel.dataPosition() < Q13) {
                    int readInt13 = parcel.readInt();
                    if (qip.M(readInt13) == 1) {
                        uri3 = (Uri) qip.U(parcel, readInt13, Uri.CREATOR);
                    } else {
                        qip.ad(parcel, readInt13);
                    }
                }
                qip.ac(parcel, Q13);
                return new DeleteFileRequest(uri3);
            case 13:
                int Q14 = qip.Q(parcel);
                while (parcel.dataPosition() < Q14) {
                    int readInt14 = parcel.readInt();
                    int M3 = qip.M(readInt14);
                    if (M3 == 1) {
                        uri2 = (Uri) qip.U(parcel, readInt14, Uri.CREATOR);
                    } else if (M3 == 2) {
                        i3 = qip.O(parcel, readInt14);
                    } else {
                        qip.ad(parcel, readInt14);
                    }
                }
                qip.ac(parcel, Q14);
                return new OpenFileDescriptorRequest(uri2, i3);
            case 14:
                int Q15 = qip.Q(parcel);
                while (parcel.dataPosition() < Q15) {
                    int readInt15 = parcel.readInt();
                    if (qip.M(readInt15) == 1) {
                        parcelFileDescriptor = (ParcelFileDescriptor) qip.U(parcel, readInt15, ParcelFileDescriptor.CREATOR);
                    } else {
                        qip.ad(parcel, readInt15);
                    }
                }
                qip.ac(parcel, Q15);
                return new OpenFileDescriptorResponse(parcelFileDescriptor);
            case 15:
                int Q16 = qip.Q(parcel);
                Uri uri4 = null;
                while (parcel.dataPosition() < Q16) {
                    int readInt16 = parcel.readInt();
                    int M4 = qip.M(readInt16);
                    if (M4 == 1) {
                        uri = (Uri) qip.U(parcel, readInt16, Uri.CREATOR);
                    } else if (M4 == 2) {
                        uri4 = (Uri) qip.U(parcel, readInt16, Uri.CREATOR);
                    } else {
                        qip.ad(parcel, readInt16);
                    }
                }
                qip.ac(parcel, Q16);
                return new RenameRequest(uri, uri4);
            case 16:
                int Q17 = qip.Q(parcel);
                ArrayList arrayList2 = null;
                boolean z2 = false;
                while (parcel.dataPosition() < Q17) {
                    int readInt17 = parcel.readInt();
                    int M5 = qip.M(readInt17);
                    if (M5 == 1) {
                        z = qip.ae(parcel, readInt17);
                    } else if (M5 == 2) {
                        z2 = qip.ae(parcel, readInt17);
                    } else if (M5 == 3) {
                        arrayList = qip.ab(parcel, readInt17, Account.CREATOR);
                    } else if (M5 == 4) {
                        arrayList2 = qip.ab(parcel, readInt17, Account.CREATOR);
                    } else {
                        qip.ad(parcel, readInt17);
                    }
                }
                qip.ac(parcel, Q17);
                return new ContactsConsentsCoarseStatus(z, z2, arrayList, arrayList2);
            case 17:
                int Q18 = qip.Q(parcel);
                Account account = null;
                String str37 = null;
                ArrayList arrayList3 = null;
                boolean z3 = false;
                boolean z4 = false;
                boolean z5 = false;
                boolean z6 = false;
                boolean z7 = false;
                boolean z8 = false;
                while (parcel.dataPosition() < Q18) {
                    int readInt18 = parcel.readInt();
                    switch (qip.M(readInt18)) {
                        case 1:
                            z3 = qip.ae(parcel, readInt18);
                            break;
                        case 2:
                            z4 = qip.ae(parcel, readInt18);
                            break;
                        case 3:
                            z5 = qip.ae(parcel, readInt18);
                            break;
                        case 4:
                            account = (Account) qip.U(parcel, readInt18, Account.CREATOR);
                            break;
                        case 5:
                            z6 = qip.ae(parcel, readInt18);
                            break;
                        case 6:
                            z7 = qip.ae(parcel, readInt18);
                            break;
                        case 7:
                            str37 = qip.Y(parcel, readInt18);
                            break;
                        case 8:
                            arrayList3 = qip.ab(parcel, readInt18, Account.CREATOR);
                            break;
                        case 9:
                            z8 = qip.ae(parcel, readInt18);
                            break;
                        default:
                            qip.ad(parcel, readInt18);
                            break;
                    }
                }
                qip.ac(parcel, Q18);
                return new ContactsConsentsConfig(z3, z4, z5, account, z6, z7, str37, arrayList3, z8);
            case 18:
                int Q19 = qip.Q(parcel);
                while (parcel.dataPosition() < Q19) {
                    int readInt19 = parcel.readInt();
                    int M6 = qip.M(readInt19);
                    if (M6 == 1) {
                        i2 = qip.O(parcel, readInt19);
                    } else if (M6 == 2) {
                        bundle = qip.S(parcel, readInt19);
                    } else {
                        qip.ad(parcel, readInt19);
                    }
                }
                qip.ac(parcel, Q19);
                return new ContactsConsentsDetailedStatus(i2, bundle);
            case 19:
                int Q20 = qip.Q(parcel);
                ContactsConsentsDetailedStatus contactsConsentsDetailedStatus = null;
                ContactsConsentsConfig contactsConsentsConfig = null;
                while (parcel.dataPosition() < Q20) {
                    int readInt20 = parcel.readInt();
                    int M7 = qip.M(readInt20);
                    if (M7 == 1) {
                        contactsConsentsCoarseStatus = (ContactsConsentsCoarseStatus) qip.U(parcel, readInt20, ContactsConsentsCoarseStatus.CREATOR);
                    } else if (M7 == 2) {
                        contactsConsentsDetailedStatus = (ContactsConsentsDetailedStatus) qip.U(parcel, readInt20, ContactsConsentsDetailedStatus.CREATOR);
                    } else if (M7 == 3) {
                        contactsConsentsConfig = (ContactsConsentsConfig) qip.U(parcel, readInt20, ContactsConsentsConfig.CREATOR);
                    } else {
                        qip.ad(parcel, readInt20);
                    }
                }
                qip.ac(parcel, Q20);
                return new ContactsConsentsStatus(contactsConsentsCoarseStatus, contactsConsentsDetailedStatus, contactsConsentsConfig);
            default:
                int readInt21 = parcel.readInt();
                String[] strArr = new String[readInt21];
                parcel.readStringArray(strArr);
                int readInt22 = parcel.readInt();
                MatrixCursor matrixCursor2 = new MatrixCursor(strArr);
                if (readInt21 != 0 || readInt22 != 0) {
                    for (int i10 = 0; i10 < readInt22; i10++) {
                        matrixCursor2.addRow(parcel.readArray(Object.class.getClassLoader()));
                    }
                    matrixCursor = matrixCursor2;
                }
                return new MatrixCursorParcelable(matrixCursor);
        }
    }
}
