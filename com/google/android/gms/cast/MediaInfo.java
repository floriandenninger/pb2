package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amrp;
import defpackage.amru;
import defpackage.qff;
import defpackage.qip;
import defpackage.qko;
import defpackage.qto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MediaInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new qff();
    public String a;
    public int b;
    public String c;
    public MediaMetadata d;
    public long e;
    public List f;
    public TextTrackStyle g;
    String h;
    public String i;
    public VastAdsRequest j;
    public long k;
    public String l;
    public String m;
    public String n;
    public String o;
    private List p;
    private List q;
    private JSONObject r;

    public MediaInfo(String str, int i, String str2, MediaMetadata mediaMetadata, long j, List list, TextTrackStyle textTrackStyle, String str3, List list2, List list3, String str4, VastAdsRequest vastAdsRequest, long j2, String str5, String str6, String str7, String str8) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = mediaMetadata;
        this.e = j;
        this.f = list;
        this.g = textTrackStyle;
        this.h = str3;
        if (str3 != null) {
            try {
                this.r = new JSONObject(str3);
            } catch (JSONException unused) {
                this.r = null;
                this.h = null;
            }
        } else {
            this.r = null;
        }
        this.p = list2;
        this.q = list3;
        this.i = str4;
        this.j = vastAdsRequest;
        this.k = j2;
        this.l = str5;
        this.m = str6;
        this.n = str7;
        this.o = str8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00a4 A[LOOP:0: B:4:0x0022->B:10:0x00a4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017a A[LOOP:2: B:34:0x00cb->B:40:0x017a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0181 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(org.json.JSONObject r40) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaInfo.a(org.json.JSONObject):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        JSONObject jSONObject = this.r;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = mediaInfo.r;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || qto.a(jSONObject, jSONObject2)) && qko.j(this.a, mediaInfo.a) && this.b == mediaInfo.b && qko.j(this.c, mediaInfo.c) && qko.j(this.d, mediaInfo.d) && this.e == mediaInfo.e && qko.j(this.f, mediaInfo.f) && qko.j(this.g, mediaInfo.g) && qko.j(this.p, mediaInfo.p) && qko.j(this.q, mediaInfo.q) && qko.j(this.i, mediaInfo.i) && qko.j(this.j, mediaInfo.j) && this.k == mediaInfo.k && qko.j(this.l, mediaInfo.l) && qko.j(this.m, mediaInfo.m) && qko.j(this.n, mediaInfo.n) && qko.j(this.o, mediaInfo.o);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d, Long.valueOf(this.e), String.valueOf(this.r), this.f, this.g, this.p, this.q, this.i, this.j, Long.valueOf(this.k), this.l, this.n, this.o});
    }

    public MediaInfo(JSONObject jSONObject) {
        this(jSONObject.optString("contentId"), -1, null, null, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        MediaInfo mediaInfo;
        int i;
        int i2;
        amru amruVar;
        String optString = jSONObject.optString("streamType", "NONE");
        if ("NONE".equals(optString)) {
            mediaInfo = this;
            mediaInfo.b = 0;
        } else {
            mediaInfo = this;
            if ("BUFFERED".equals(optString)) {
                mediaInfo.b = 1;
            } else if ("LIVE".equals(optString)) {
                mediaInfo.b = 2;
            } else {
                mediaInfo.b = -1;
            }
        }
        mediaInfo.c = qko.e(jSONObject, "contentType");
        if (jSONObject.has("metadata")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
            MediaMetadata mediaMetadata = new MediaMetadata(jSONObject2.getInt("metadataType"));
            mediaInfo.d = mediaMetadata;
            mediaMetadata.b(jSONObject2);
        }
        mediaInfo.e = -1L;
        if (jSONObject.has("duration") && !jSONObject.isNull("duration")) {
            double optDouble = jSONObject.optDouble("duration", 0.0d);
            if (!Double.isNaN(optDouble) && !Double.isInfinite(optDouble)) {
                mediaInfo.e = qko.b(optDouble);
            }
        }
        if (jSONObject.has("tracks")) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("tracks");
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i3);
                long j = jSONObject3.getLong("trackId");
                String optString2 = jSONObject3.optString("type");
                if ("TEXT".equals(optString2)) {
                    i = 1;
                } else if ("AUDIO".equals(optString2)) {
                    i = 2;
                } else {
                    i = "VIDEO".equals(optString2) ? 3 : 0;
                }
                String e = qko.e(jSONObject3, "trackContentId");
                String e2 = qko.e(jSONObject3, "trackContentType");
                String e3 = qko.e(jSONObject3, "name");
                String e4 = qko.e(jSONObject3, "language");
                if (jSONObject3.has("subtype")) {
                    String string = jSONObject3.getString("subtype");
                    if ("SUBTITLES".equals(string)) {
                        i2 = 1;
                    } else if ("CAPTIONS".equals(string)) {
                        i2 = 2;
                    } else if ("DESCRIPTIONS".equals(string)) {
                        i2 = 3;
                    } else if ("CHAPTERS".equals(string)) {
                        i2 = 4;
                    } else {
                        i2 = "METADATA".equals(string) ? 5 : -1;
                    }
                } else {
                    i2 = 0;
                }
                if (jSONObject3.has("roles")) {
                    amrp f = amru.f();
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("roles");
                    for (int i4 = 0; i4 < jSONArray2.length(); i4++) {
                        f.h(jSONArray2.optString(i4));
                    }
                    amruVar = f.g();
                } else {
                    amruVar = null;
                }
                arrayList.add(new MediaTrack(j, i, e, e2, e3, e4, i2, amruVar, jSONObject3.optJSONObject("customData")));
            }
            mediaInfo.f = new ArrayList(arrayList);
        } else {
            mediaInfo.f = null;
        }
        if (jSONObject.has("textTrackStyle")) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("textTrackStyle");
            TextTrackStyle textTrackStyle = new TextTrackStyle(1.0f, 0, 0, -1, 0, -1, 0, 0, null, -1, -1, null);
            textTrackStyle.a = (float) jSONObject4.optDouble("fontScale", 1.0d);
            textTrackStyle.b = TextTrackStyle.a(jSONObject4.optString("foregroundColor"));
            textTrackStyle.c = TextTrackStyle.a(jSONObject4.optString("backgroundColor"));
            if (jSONObject4.has("edgeType")) {
                String string2 = jSONObject4.getString("edgeType");
                if ("NONE".equals(string2)) {
                    textTrackStyle.d = 0;
                } else if ("OUTLINE".equals(string2)) {
                    textTrackStyle.d = 1;
                } else if ("DROP_SHADOW".equals(string2)) {
                    textTrackStyle.d = 2;
                } else if ("RAISED".equals(string2)) {
                    textTrackStyle.d = 3;
                } else if ("DEPRESSED".equals(string2)) {
                    textTrackStyle.d = 4;
                }
            }
            textTrackStyle.e = TextTrackStyle.a(jSONObject4.optString("edgeColor"));
            if (jSONObject4.has("windowType")) {
                String string3 = jSONObject4.getString("windowType");
                if ("NONE".equals(string3)) {
                    textTrackStyle.f = 0;
                } else if ("NORMAL".equals(string3)) {
                    textTrackStyle.f = 1;
                } else if ("ROUNDED_CORNERS".equals(string3)) {
                    textTrackStyle.f = 2;
                }
            }
            textTrackStyle.g = TextTrackStyle.a(jSONObject4.optString("windowColor"));
            if (textTrackStyle.f == 2) {
                textTrackStyle.h = jSONObject4.optInt("windowRoundedCornerRadius", 0);
            }
            textTrackStyle.i = qko.e(jSONObject4, "fontFamily");
            if (jSONObject4.has("fontGenericFamily")) {
                String string4 = jSONObject4.getString("fontGenericFamily");
                if ("SANS_SERIF".equals(string4)) {
                    textTrackStyle.j = 0;
                } else if ("MONOSPACED_SANS_SERIF".equals(string4)) {
                    textTrackStyle.j = 1;
                } else if ("SERIF".equals(string4)) {
                    textTrackStyle.j = 2;
                } else if ("MONOSPACED_SERIF".equals(string4)) {
                    textTrackStyle.j = 3;
                } else if ("CASUAL".equals(string4)) {
                    textTrackStyle.j = 4;
                } else if ("CURSIVE".equals(string4)) {
                    textTrackStyle.j = 5;
                } else if ("SMALL_CAPITALS".equals(string4)) {
                    textTrackStyle.j = 6;
                }
            }
            if (jSONObject4.has("fontStyle")) {
                String string5 = jSONObject4.getString("fontStyle");
                if ("NORMAL".equals(string5)) {
                    textTrackStyle.k = 0;
                } else if ("BOLD".equals(string5)) {
                    textTrackStyle.k = 1;
                } else if ("ITALIC".equals(string5)) {
                    textTrackStyle.k = 2;
                } else if ("BOLD_ITALIC".equals(string5)) {
                    textTrackStyle.k = 3;
                }
            }
            textTrackStyle.m = jSONObject4.optJSONObject("customData");
            mediaInfo.g = textTrackStyle;
        } else {
            mediaInfo.g = null;
        }
        a(jSONObject);
        mediaInfo.r = jSONObject.optJSONObject("customData");
        mediaInfo.i = qko.e(jSONObject, "entity");
        mediaInfo.l = qko.e(jSONObject, "atvEntity");
        mediaInfo.j = VastAdsRequest.a(jSONObject.optJSONObject("vmapAdsRequest"));
        if (jSONObject.has("startAbsoluteTime") && !jSONObject.isNull("startAbsoluteTime")) {
            double optDouble2 = jSONObject.optDouble("startAbsoluteTime");
            if (!Double.isNaN(optDouble2) && !Double.isInfinite(optDouble2) && optDouble2 >= 0.0d) {
                mediaInfo.k = qko.b(optDouble2);
            }
        }
        if (jSONObject.has("contentUrl")) {
            mediaInfo.m = jSONObject.optString("contentUrl");
        }
        mediaInfo.n = qko.e(jSONObject, "hlsSegmentFormat");
        mediaInfo.o = qko.e(jSONObject, "hlsVideoSegmentFormat");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.r;
        this.h = jSONObject == null ? null : jSONObject.toString();
        int m = qip.m(parcel);
        qip.F(parcel, 2, this.a);
        qip.s(parcel, 3, this.b);
        qip.F(parcel, 4, this.c);
        qip.E(parcel, 5, this.d, i);
        qip.t(parcel, 6, this.e);
        qip.J(parcel, 7, this.f);
        qip.E(parcel, 8, this.g, i);
        qip.F(parcel, 9, this.h);
        List list = this.p;
        qip.J(parcel, 10, list == null ? null : Collections.unmodifiableList(list));
        List list2 = this.q;
        qip.J(parcel, 11, list2 != null ? Collections.unmodifiableList(list2) : null);
        qip.F(parcel, 12, this.i);
        qip.E(parcel, 13, this.j, i);
        qip.t(parcel, 14, this.k);
        qip.F(parcel, 15, this.l);
        qip.F(parcel, 16, this.m);
        qip.F(parcel, 17, this.n);
        qip.F(parcel, 18, this.o);
        qip.n(parcel, m);
    }
}
