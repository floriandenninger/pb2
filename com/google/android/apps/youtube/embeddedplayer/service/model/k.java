package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.youtube.embeddedplayer.service.prewarm.model.EmbedsPrewarmData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuItem;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.WatchLaterButtonData;
import com.google.android.exoplayer.ColorInfo;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.flac.VorbisComment;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.metadata.icy.IcyInfo;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.BinaryFrame;
import defpackage.agaj;
import defpackage.aomf;
import defpackage.pse;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class k implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public k(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new VideoDetails[i];
            case 1:
                return new SimplePlaybackDescriptor[i];
            case 2:
                return new VideoDetailsCollapsed[i];
            case 3:
                return new VideoDetailsExpanded[i];
            case 4:
                return new EmbedsPrewarmData[i];
            case 5:
                return new SubscribeButtonData[i];
            case 6:
                return new SubscriptionNotificationButtonData[i];
            case 7:
                return new SubscriptionNotificationMenuData[i];
            case 8:
                return new SubscriptionNotificationMenuItem[i];
            case 9:
                return new WatchLaterButtonData[i];
            case 10:
                return new ColorInfo[0];
            case 11:
                return new MediaFormat[i];
            case 12:
                return new Metadata[i];
            case 13:
                return new AppInfoTable[i];
            case 14:
                return new EventMessage[i];
            case 15:
                return new PictureFrame[i];
            case 16:
                return new VorbisComment[i];
            case 17:
                return new IcyHeaders[i];
            case 18:
                return new IcyInfo[i];
            case 19:
                return new ApicFrame[i];
            default:
                return new BinaryFrame[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        aomf x;
        aomf x2;
        aomf aomfVar;
        aomf x3;
        aomf x4;
        aomf x5;
        switch (this.a) {
            case 0:
                VideoDetailsCollapsed videoDetailsCollapsed = (VideoDetailsCollapsed) VideoDetailsCollapsed.CREATOR.createFromParcel(parcel);
                VideoDetailsExpanded videoDetailsExpanded = (VideoDetailsExpanded) VideoDetailsExpanded.CREATOR.createFromParcel(parcel);
                l c = VideoDetails.c();
                c.b(videoDetailsCollapsed);
                c.c(videoDetailsExpanded);
                return c.a();
            case 1:
                return new SimplePlaybackDescriptor(parcel);
            case 2:
                CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                CharSequence charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                byte[] createByteArray = parcel.createByteArray();
                if (createByteArray == null) {
                    x = aomf.b;
                } else {
                    x = aomf.x(createByteArray);
                }
                m d = VideoDetailsCollapsed.d();
                d.a = charSequence;
                d.b = charSequence2;
                d.d(x);
                return d.c();
            case 3:
                CharSequence charSequence3 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                CharSequence charSequence4 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                byte[] createByteArray2 = parcel.createByteArray();
                if (createByteArray2 == null) {
                    x2 = aomf.b;
                } else {
                    x2 = aomf.x(createByteArray2);
                }
                m d2 = VideoDetailsExpanded.d();
                d2.a = charSequence3;
                d2.b = charSequence4;
                d2.b(x2);
                return d2.a();
            case 4:
                agaj c2 = EmbedsPrewarmData.c();
                c2.e(parcel.readInt());
                String readString = parcel.readString();
                readString.getClass();
                c2.f(readString);
                return c2.d();
            case 5:
                com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.a e = SubscribeButtonData.e();
                e.e(parcel.readInt());
                e.a = parcel.readString();
                e.b = parcel.readString();
                byte[] createByteArray3 = parcel.createByteArray();
                if (createByteArray3 != null) {
                    aomfVar = aomf.x(createByteArray3);
                } else {
                    aomfVar = aomf.b;
                }
                e.f(aomfVar);
                return e.d();
            case 6:
                com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.a e2 = SubscriptionNotificationButtonData.e();
                e2.c(parcel.readInt());
                e2.b(parcel.readInt());
                e2.a = parcel.readString();
                byte[] createByteArray4 = parcel.createByteArray();
                if (createByteArray4 == null) {
                    x3 = aomf.b;
                } else {
                    x3 = aomf.x(createByteArray4);
                }
                e2.d(x3);
                return e2.a();
            case 7:
                SubscriptionNotificationMenuItem[] subscriptionNotificationMenuItemArr = (SubscriptionNotificationMenuItem[]) parcel.createTypedArray(SubscriptionNotificationMenuItem.CREATOR);
                if (subscriptionNotificationMenuItemArr == null) {
                    return new SubscriptionNotificationMenuData(new ArrayList());
                }
                return new SubscriptionNotificationMenuData(Arrays.asList(subscriptionNotificationMenuItemArr));
            case 8:
                com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.b g = SubscriptionNotificationMenuItem.g();
                g.d(parcel.readInt());
                g.c(parcel.readByte() != 0);
                g.b(parcel.readInt());
                g.a = parcel.readString();
                g.b = parcel.readString();
                byte[] createByteArray5 = parcel.createByteArray();
                if (createByteArray5 == null) {
                    x4 = aomf.b;
                } else {
                    x4 = aomf.x(createByteArray5);
                }
                g.e(x4);
                return g.a();
            case 9:
                com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.a e3 = WatchLaterButtonData.e();
                e3.b(parcel.readInt());
                e3.a = parcel.readString();
                e3.b = parcel.readString();
                byte[] createByteArray6 = parcel.createByteArray();
                if (createByteArray6 == null) {
                    x5 = aomf.b;
                } else {
                    x5 = aomf.x(createByteArray6);
                }
                e3.c(x5);
                return e3.a();
            case 10:
                return new ColorInfo(parcel);
            case 11:
                return new MediaFormat(parcel);
            case 12:
                return new Metadata(parcel);
            case 13:
                String readString2 = parcel.readString();
                pse.c(readString2);
                return new AppInfoTable(parcel.readInt(), readString2);
            case 14:
                return new EventMessage(parcel);
            case 15:
                return new PictureFrame(parcel);
            case 16:
                return new VorbisComment(parcel);
            case 17:
                return new IcyHeaders(parcel);
            case 18:
                return new IcyInfo(parcel);
            case 19:
                return new ApicFrame(parcel);
            default:
                return new BinaryFrame(parcel);
        }
    }
}
