package defpackage;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.text.TextUtils;
import android.util.Log;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.decoder.CryptoConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aze implements ayy {
    public static final azc b = azc.a;
    public final MediaDrm a;
    private final UUID c;
    private int d;

    private aze(UUID uuid) {
        pse.c(uuid);
        pse.f(!plh.b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.c = uuid;
        MediaDrm mediaDrm = new MediaDrm(q(uuid));
        this.a = mediaDrm;
        this.d = 1;
        if (plh.d.equals(uuid) && "ASUS_Z00AD".equals(pts.d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    public static aze p(UUID uuid) {
        try {
            return new aze(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new azj(1, e);
        } catch (Exception e2) {
            throw new azj(2, e2);
        }
    }

    private static UUID q(UUID uuid) {
        return (pts.a >= 27 || !plh.c.equals(uuid)) ? uuid : plh.b;
    }

    @Override // defpackage.ayy
    public final int a() {
        return 2;
    }

    @Override // defpackage.ayy
    public final /* bridge */ /* synthetic */ CryptoConfig b(byte[] bArr) {
        int i = pts.a;
        return new ayz(q(this.c), bArr);
    }

    @Override // defpackage.ayy
    public final Map c(byte[] bArr) {
        return this.a.queryKeyStatus(bArr);
    }

    @Override // defpackage.ayy
    public final void d(byte[] bArr) {
        this.a.closeSession(bArr);
    }

    @Override // defpackage.ayy
    public final void e(byte[] bArr) {
        this.a.provideProvisionResponse(bArr);
    }

    @Override // defpackage.ayy
    public final synchronized void f() {
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            this.a.release();
        }
    }

    @Override // defpackage.ayy
    public final void g(byte[] bArr, byte[] bArr2) {
        this.a.restoreKeys(bArr, bArr2);
    }

    @Override // defpackage.ayy
    public final void i(String str, String str2) {
        this.a.setPropertyString(str, str2);
    }

    @Override // defpackage.ayy
    public final boolean j(byte[] bArr, String str) {
        if (pts.a >= 31) {
            return azd.a(this.a, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.c, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // defpackage.ayy
    public final byte[] k() {
        return this.a.openSession();
    }

    @Override // defpackage.ayy
    public final byte[] l(byte[] bArr, byte[] bArr2) {
        if (plh.c.equals(this.c) && pts.a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(pts.E(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(aru.f(jSONObject2.getString("k")));
                    sb.append("\",\"kid\":\"");
                    sb.append(aru.f(jSONObject2.getString("kid")));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = pts.Z(sb.toString());
            } catch (JSONException e) {
                String E = pts.E(bArr2);
                prh.j("ClearKeyUtil", E.length() != 0 ? "Failed to adjust response data: ".concat(E) : new String("Failed to adjust response data: "), e);
            }
        }
        return this.a.provideKeyResponse(bArr, bArr2);
    }

    @Override // defpackage.ayy
    public final String m() {
        return this.a.getPropertyString("securityLevel");
    }

    @Override // defpackage.ayy
    public final ztp n() {
        MediaDrm.ProvisionRequest provisionRequest = this.a.getProvisionRequest();
        return new ztp(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // defpackage.ayy
    public final ztp o(byte[] bArr, List list, int i, HashMap hashMap) {
        byte[] bArr2;
        String str;
        DrmInitData.SchemeData schemeData;
        byte[] bArr3;
        int length;
        DrmInitData.SchemeData schemeData2 = null;
        if (list != null) {
            if (!plh.d.equals(this.c)) {
                schemeData = (DrmInitData.SchemeData) list.get(0);
            } else {
                if (pts.a >= 28 && list.size() > 1) {
                    DrmInitData.SchemeData schemeData3 = (DrmInitData.SchemeData) list.get(0);
                    int i2 = 0;
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        DrmInitData.SchemeData schemeData4 = (DrmInitData.SchemeData) list.get(i3);
                        byte[] bArr4 = (byte[]) pse.c(schemeData4.d);
                        if (pts.R(schemeData4.c, schemeData3.c) && pts.R(schemeData4.b, schemeData3.b) && jf.c(bArr4) != null) {
                            i2 += bArr4.length;
                        }
                    }
                    byte[] bArr5 = new byte[i2];
                    int i4 = 0;
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        byte[] bArr6 = (byte[]) pse.c(((DrmInitData.SchemeData) list.get(i5)).d);
                        int length2 = bArr6.length;
                        System.arraycopy(bArr6, 0, bArr5, i4, length2);
                        i4 += length2;
                    }
                    schemeData = new DrmInitData.SchemeData(schemeData3.a, schemeData3.b, schemeData3.c, bArr5);
                }
                for (int i6 = 0; i6 < list.size(); i6++) {
                    DrmInitData.SchemeData schemeData5 = (DrmInitData.SchemeData) list.get(i6);
                    int b2 = jf.b((byte[]) pse.c(schemeData5.d));
                    if ((pts.a < 23 && b2 == 0) || (pts.a >= 23 && b2 == 1)) {
                        schemeData2 = schemeData5;
                        break;
                    }
                }
                schemeData = (DrmInitData.SchemeData) list.get(0);
            }
            schemeData2 = schemeData;
            UUID uuid = this.c;
            byte[] bArr7 = (byte[]) pse.c(schemeData2.d);
            if (plh.e.equals(uuid)) {
                byte[] d = jf.d(bArr7, uuid);
                if (d != null) {
                    bArr7 = d;
                }
                UUID uuid2 = plh.e;
                pth pthVar = new pth(bArr7);
                int e = pthVar.e();
                short x = pthVar.x();
                short x2 = pthVar.x();
                if (x == 1 && x2 == 1) {
                    String w = pthVar.w(pthVar.x(), amme.d);
                    if (!w.contains("<LA_URL>")) {
                        int indexOf = w.indexOf("</DATA>");
                        if (indexOf == -1) {
                            Log.w("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
                            indexOf = -1;
                        }
                        String substring = w.substring(0, indexOf);
                        String substring2 = w.substring(indexOf);
                        StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 26 + String.valueOf(substring2).length());
                        sb.append(substring);
                        sb.append("<LA_URL>https://x</LA_URL>");
                        sb.append(substring2);
                        String sb2 = sb.toString();
                        int i7 = e + 52;
                        ByteBuffer allocate = ByteBuffer.allocate(i7);
                        allocate.order(ByteOrder.LITTLE_ENDIAN);
                        allocate.putInt(i7);
                        allocate.putShort((short) 1);
                        allocate.putShort((short) 1);
                        int length3 = sb2.length();
                        allocate.putShort((short) (length3 + length3));
                        allocate.put(sb2.getBytes(amme.d));
                        bArr7 = allocate.array();
                    }
                }
                int length4 = (bArr7 != null ? bArr7.length : 0) + 32;
                ByteBuffer allocate2 = ByteBuffer.allocate(length4);
                allocate2.putInt(length4);
                allocate2.putInt(1886614376);
                allocate2.putInt(0);
                allocate2.putLong(uuid2.getMostSignificantBits());
                allocate2.putLong(uuid2.getLeastSignificantBits());
                if (bArr7 != null && (length = bArr7.length) != 0) {
                    allocate2.putInt(length);
                    allocate2.put(bArr7);
                }
                bArr7 = allocate2.array();
            }
            if (((pts.a >= 23 || !plh.d.equals(uuid)) && (!plh.e.equals(uuid) || !"Amazon".equals(pts.c) || (!"AFTB".equals(pts.d) && !"AFTS".equals(pts.d) && !"AFTM".equals(pts.d) && !"AFTT".equals(pts.d)))) || (bArr3 = jf.d(bArr7, uuid)) == null) {
                bArr3 = bArr7;
            }
            UUID uuid3 = this.c;
            String str2 = schemeData2.c;
            bArr2 = bArr3;
            str = (pts.a < 26 && plh.c.equals(uuid3) && ("video/mp4".equals(str2) || "audio/mp4".equals(str2))) ? "cenc" : str2;
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.a.getKeyRequest(bArr, bArr2, str, i, hashMap);
        UUID uuid4 = this.c;
        byte[] data = keyRequest.getData();
        if (plh.c.equals(uuid4) && pts.a < 27) {
            data = pts.Z(pts.E(data).replace('+', '-').replace('/', '_'));
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if (true == "https://x".equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && schemeData2 != null && !TextUtils.isEmpty(schemeData2.b)) {
            defaultUrl = schemeData2.b;
        }
        if (pts.a >= 23) {
            keyRequest.getRequestType();
        }
        return new ztp(data, defaultUrl);
    }

    @Override // defpackage.ayy
    public final void h(final ayx ayxVar) {
        this.a.setOnEventListener(ayxVar == null ? null : new MediaDrm.OnEventListener() { // from class: aza
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                ayx.this.a(bArr, i);
            }
        });
    }
}
