package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.google.android.libraries.youtube.account.image.CropActivity;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint;
import com.google.protos.youtube.api.innertube.EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint;
import com.google.protos.youtube.api.innertube.GetPhotoEndpointOuterClass$GetPhotoEndpoint;
import com.google.protos.youtube.api.innertube.UploadPhotoEndpointOuterClass$UploadPhotoEndpoint;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wdy extends wdp {
    private static final Intent an = new Intent();
    private static final aomw ao;
    private static final Integer ap;
    public wdt a;
    public aahd ae;
    public ajjs af;
    public zaw ag;
    public SharedPreferences ah;
    public aaea ai;
    public Uri aj;
    public String ak;
    public String al;
    public boolean am;
    private GetPhotoEndpointOuterClass$GetPhotoEndpoint aq;
    private UploadPhotoEndpointOuterClass$UploadPhotoEndpoint ar;
    private Uri as;
    private boolean at;
    private boolean au;
    public wdz b;
    public ScheduledExecutorService c;
    public Executor d;
    public aavf e;

    static {
        aomw c = aomw.c();
        c.e(UploadPhotoEndpointOuterClass$UploadPhotoEndpoint.uploadPhotoEndpoint);
        c.e(EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint.editChannelAvatarEndpoint);
        c.e(EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint.editChannelBannerEndpoint);
        ao = c;
        ap = 90;
    }

    private static File aF(Context context) {
        try {
            File file = new File(context.getCacheDir(), "photos");
            if (!file.exists()) {
                file.mkdir();
            }
            return File.createTempFile("image", ".jpeg", file);
        } catch (IOException e) {
            throw new wdu("Failed to create temp image file.", e);
        }
    }

    private final void aG() {
        aqyg aqygVar;
        GetPhotoEndpointOuterClass$GetPhotoEndpoint getPhotoEndpointOuterClass$GetPhotoEndpoint = this.aq;
        if ((getPhotoEndpointOuterClass$GetPhotoEndpoint.b & 4) != 0) {
            try {
                arbo arboVar = getPhotoEndpointOuterClass$GetPhotoEndpoint.e;
                if (arboVar == null) {
                    arboVar = arbo.a;
                }
                Intent intent = new Intent(C(), (Class<?>) CropActivity.class);
                intent.setData(this.as);
                Uri fromFile = Uri.fromFile(aF(qR()));
                this.aj = fromFile;
                intent.putExtra("output", fromFile);
                if ((arboVar.b & 64) != 0) {
                    aqyg aqygVar2 = arboVar.i;
                    if (aqygVar2 == null) {
                        aqygVar2 = aqyg.a;
                    }
                    intent.putExtra("cropLabel", aahk.a(aqygVar2, this.a.c(), false));
                }
                intent.putExtra("widthRatio", arboVar.c);
                intent.putExtra("heightRatio", arboVar.d);
                int i = arboVar.e;
                if (i > 0) {
                    intent.putExtra("minWidth", i);
                }
                int i2 = arboVar.f;
                if (i2 > 0) {
                    intent.putExtra("minHeight", i2);
                }
                int i3 = arboVar.g;
                if (i3 > 0) {
                    intent.putExtra("minOutputWidth", i3);
                }
                int i4 = arboVar.h;
                if (i4 > 0) {
                    intent.putExtra("minOutputHeight", i4);
                }
                if ((arboVar.b & 512) != 0) {
                    aqyg aqygVar3 = arboVar.l;
                    if (aqygVar3 == null) {
                        aqygVar3 = aqyg.a;
                    }
                    intent.putExtra("visualCropLabel", aahk.a(aqygVar3, this.a.c(), false));
                }
                int i5 = arboVar.j;
                if (i5 > 0) {
                    intent.putExtra("visualWidthRatio", i5);
                }
                int i6 = arboVar.k;
                if (i6 > 0) {
                    intent.putExtra("visualHeightRatio", i6);
                }
                if ((arboVar.b & 2048) != 0) {
                    aqyg aqygVar4 = arboVar.n;
                    if (aqygVar4 == null) {
                        aqygVar4 = aqyg.a;
                    }
                    intent.putExtra("visualDoubleCropLabel", aahk.a(aqygVar4, this.a.c(), false));
                }
                int i7 = arboVar.m;
                if (i7 > 0) {
                    intent.putExtra("visualDoubleWidthRatio", i7);
                }
                GetPhotoEndpointOuterClass$GetPhotoEndpoint getPhotoEndpointOuterClass$GetPhotoEndpoint2 = this.aq;
                if ((getPhotoEndpointOuterClass$GetPhotoEndpoint2.b & 8) != 0) {
                    aqygVar = getPhotoEndpointOuterClass$GetPhotoEndpoint2.f;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                } else {
                    aqygVar = null;
                }
                intent.putExtra("cropInfo", aahk.a(aqygVar, this.a.c(), true));
                startActivityForResult(intent, 2);
                return;
            } catch (wdu e) {
                p(qX().getString(R.string.image_upload_something_went_wrong), e);
                return;
            }
        }
        this.aj = this.as;
        aJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0096 A[Catch: wdu -> 0x00ab, TRY_ENTER, TryCatch #1 {wdu -> 0x00ab, blocks: (B:14:0x003f, B:26:0x0073, B:28:0x0078, B:41:0x0096, B:43:0x009b, B:44:0x009e, B:30:0x009f), top: B:13:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009b A[Catch: wdu -> 0x00ab, TryCatch #1 {wdu -> 0x00ab, blocks: (B:14:0x003f, B:26:0x0073, B:28:0x0078, B:41:0x0096, B:43:0x009b, B:44:0x009e, B:30:0x009f), top: B:13:0x003f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void aH() {
        /*
            r10 = this;
            r0 = 1
            r10.am = r0
            zaw r0 = r10.ag
            com.google.protos.youtube.api.innertube.UploadPhotoEndpointOuterClass$UploadPhotoEndpoint r1 = r10.ar
            int r2 = r1.b
            r2 = r2 & 128(0x80, float:1.8E-43)
            r3 = 0
            if (r2 == 0) goto L15
            aqyg r1 = r1.h
            if (r1 != 0) goto L16
            aqyg r1 = defpackage.aqyg.a
            goto L16
        L15:
            r1 = r3
        L16:
            android.text.Spanned r1 = defpackage.ajcq.b(r1)
            java.lang.String r1 = r1.toString()
            r0.d(r1)
            ci r0 = r10.C()
            com.google.protos.youtube.api.innertube.UploadPhotoEndpointOuterClass$UploadPhotoEndpoint r1 = r10.ar
            avgg r1 = r1.g
            if (r1 != 0) goto L2d
            avgg r1 = defpackage.avgg.a
        L2d:
            aony r1 = r1.c
            java.util.Iterator r1 = r1.iterator()
        L33:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lb2
            java.lang.Object r2 = r1.next()
            avgf r2 = (defpackage.avgf) r2
            android.net.Uri r4 = r10.aj     // Catch: defpackage.wdu -> Lab
            int r5 = r2.d     // Catch: defpackage.wdu -> Lab
            int r6 = r2.e     // Catch: defpackage.wdu -> Lab
            if (r5 == 0) goto L9f
            if (r6 == 0) goto L9f
            android.content.ContentResolver r7 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L87 java.io.IOException -> L8b
            java.io.InputStream r4 = r7.openInputStream(r4)     // Catch: java.lang.Throwable -> L87 java.io.IOException -> L8b
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r4)     // Catch: java.lang.Throwable -> L87 java.io.IOException -> L8b
            android.graphics.Bitmap r5 = defpackage.whu.w(r4, r5, r6)     // Catch: java.lang.Throwable -> L81 java.io.IOException -> L84
            java.io.File r6 = aF(r0)     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L7f
            android.graphics.Bitmap$CompressFormat r7 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L7f
            java.lang.Integer r8 = defpackage.wdy.ap     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L7f
            int r8 = r8.intValue()     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L7f
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L7f
            r9.<init>(r6)     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L7f
            r5.compress(r7, r8, r9)     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L7f
            android.net.Uri r6 = android.net.Uri.fromFile(r6)     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L7f
            if (r4 == 0) goto L76
            r4.recycle()     // Catch: defpackage.wdu -> Lab
        L76:
            if (r5 == 0) goto L7b
            r5.recycle()     // Catch: defpackage.wdu -> Lab
        L7b:
            r4 = r6
            goto L9f
        L7d:
            r2 = move-exception
            goto L94
        L7f:
            r2 = move-exception
            goto L8e
        L81:
            r2 = move-exception
            r5 = r3
            goto L94
        L84:
            r2 = move-exception
            r5 = r3
            goto L8e
        L87:
            r2 = move-exception
            r4 = r3
            r5 = r4
            goto L94
        L8b:
            r2 = move-exception
            r4 = r3
            r5 = r4
        L8e:
            wdu r6 = new wdu     // Catch: java.lang.Throwable -> L7d
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L7d
            throw r6     // Catch: java.lang.Throwable -> L7d
        L94:
            if (r4 == 0) goto L99
            r4.recycle()     // Catch: defpackage.wdu -> Lab
        L99:
            if (r5 == 0) goto L9e
            r5.recycle()     // Catch: defpackage.wdu -> Lab
        L9e:
            throw r2     // Catch: defpackage.wdu -> Lab
        L9f:
            java.lang.String r2 = r2.c     // Catch: defpackage.wdu -> Lab
            android.net.Uri r2 = defpackage.wbs.aj(r2)     // Catch: defpackage.wdu -> Lab
            ajjs r5 = r10.af     // Catch: defpackage.wdu -> Lab
            r5.f(r2, r4)     // Catch: defpackage.wdu -> Lab
            goto L33
        Lab:
            r2 = move-exception
            java.lang.String r4 = "Exception scaling image "
            defpackage.zga.d(r4, r2)
            goto L33
        Lb2:
            wdt r0 = r10.a
            java.lang.String r1 = r10.al
            android.net.Uri r2 = r10.aj
            r0.i(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wdy.aH():void");
    }

    private final void aI() {
        this.am = true;
        this.a.g();
    }

    private final void aJ() {
        if (this.aj == null) {
            p(qX().getString(R.string.image_upload_something_went_wrong), new wdu());
            return;
        }
        apmh apmhVar = this.aq.d;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        apmg apmgVar = apmhVar.c;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        if ((apmgVar.b & 32768) == 0) {
            p(qX().getString(R.string.image_upload_something_went_wrong), new wdu("No endpoint to route after cropping an image."));
            return;
        }
        aahd aahdVar = this.ae;
        apxf apxfVar = apmgVar.p;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        try {
            apxfVar = (apxf) aonm.parseFrom(apxf.a, apxfVar.toByteArray(), ao);
        } catch (aoob e) {
            p(qX().getString(R.string.image_upload_something_went_wrong), new wdu("Invalid protocol buffer.", e));
        }
        aahdVar.a(apxfVar);
    }

    private final void aK() {
        Intent intent;
        if (this.am) {
            this.a.d();
            return;
        }
        UploadPhotoEndpointOuterClass$UploadPhotoEndpoint uploadPhotoEndpointOuterClass$UploadPhotoEndpoint = this.ar;
        if (uploadPhotoEndpointOuterClass$UploadPhotoEndpoint != null) {
            r(uploadPhotoEndpointOuterClass$UploadPhotoEndpoint);
            return;
        }
        if (!this.at) {
            int dY = amkq.dY(this.aq.c);
            if (dY == 0) {
                dY = 1;
            }
            int i = dY - 1;
            if (i == 1) {
                try {
                    if (Build.VERSION.SDK_INT < 23 || aL("android.permission.CAMERA")) {
                        intent = new Intent("android.media.action.IMAGE_CAPTURE");
                        Uri a = ev.a(qR(), "com.google.android.youtube.fileprovider", aF(qR()));
                        this.as = a;
                        intent.putExtra("output", a);
                        intent.setClipData(ClipData.newUri(qR().getContentResolver(), "images", this.as));
                        intent.setFlags(3);
                    } else {
                        intent = an;
                    }
                } catch (wdu e) {
                    p(qX().getString(R.string.image_upload_something_went_wrong), e);
                    return;
                }
            } else if (i == 2) {
                if (Build.VERSION.SDK_INT < 23 || aL("android.permission.READ_EXTERNAL_STORAGE")) {
                    intent = new Intent("android.intent.action.GET_CONTENT");
                    intent.setType("image/*");
                    intent.addCategory("android.intent.category.OPENABLE");
                } else {
                    intent = an;
                }
            } else {
                p(qX().getString(R.string.image_upload_something_went_wrong), new wdu("Unknown get image action."));
                return;
            }
            if (intent == an) {
                return;
            }
            startActivityForResult(intent, 1);
            return;
        }
        if (!this.au) {
            aG();
        } else {
            aJ();
        }
    }

    private final boolean aL(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i <= 0; i++) {
            String str = strArr[i];
            if (aih.c(C(), str) == -1) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        Set<String> stringSet = this.ah.getStringSet("permissions_requested", null);
        if (stringSet != null && !stringSet.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (stringSet.contains(str2) && !aw(str2)) {
                    arrayList2.add(str2);
                    it.remove();
                }
            }
        }
        if (!arrayList.isEmpty()) {
            HashSet hashSet = new HashSet(arrayList);
            if (stringSet != null) {
                hashSet.addAll(stringSet);
            }
            this.ah.edit().putStringSet("permissions_requested", hashSet).commit();
            ac((String[]) arrayList.toArray(new String[0]), 3);
        } else if (!arrayList2.isEmpty()) {
            this.am = true;
            amkq.E(!arrayList2.isEmpty());
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("permissions", arrayList2);
            web webVar = new web();
            webVar.af(bundle);
            dd ddVar = this.z;
            ddVar.getClass();
            dn k = ddVar.k();
            k.r(webVar, "photo_upload_permission_fragment");
            k.a();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static wdy o(GetPhotoEndpointOuterClass$GetPhotoEndpoint getPhotoEndpointOuterClass$GetPhotoEndpoint) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("arg_get_photo_endpoint", getPhotoEndpointOuterClass$GetPhotoEndpoint.toByteArray());
        wdy wdyVar = new wdy();
        wdyVar.af(bundle);
        return wdyVar;
    }

    @Override // defpackage.ce
    public final void S(Bundle bundle) {
        super.S(bundle);
        try {
            byte[] byteArray = this.m.getByteArray("arg_get_photo_endpoint");
            aomw aomwVar = ao;
            this.aq = (GetPhotoEndpointOuterClass$GetPhotoEndpoint) aonm.parseFrom(GetPhotoEndpointOuterClass$GetPhotoEndpoint.a, byteArray, aomwVar);
            if (bundle != null) {
                this.as = (Uri) bundle.getParcelable("arg_image_uri");
                this.aj = (Uri) bundle.getParcelable("arg_crop_uri");
                this.ak = bundle.getString("arg_external_channel_id");
                this.al = bundle.getString("arg_encrypted_blob_id");
                this.at = bundle.getBoolean("arg_get_image_finished", this.at);
                this.au = bundle.getBoolean("arg_crop_image_finished", this.au);
                this.am = bundle.getBoolean("arg_dismissed", this.am);
                if (bundle.containsKey("arg_upload_photo_endpoint")) {
                    try {
                        this.ar = (UploadPhotoEndpointOuterClass$UploadPhotoEndpoint) aonm.parseFrom(UploadPhotoEndpointOuterClass$UploadPhotoEndpoint.a, bundle.getByteArray("arg_upload_photo_endpoint"), aomwVar);
                    } catch (aoob unused) {
                    }
                }
            }
            aK();
        } catch (aoob unused2) {
            throw new RuntimeException("Miracles do happen");
        }
    }

    @Override // defpackage.ce
    public final void Y(int i, String[] strArr, int[] iArr) {
        amkq.E(i == 3);
        for (int i2 : iArr) {
            if (i2 == -1) {
                aI();
                return;
            }
        }
        aK();
    }

    @Override // defpackage.ce
    public final void mQ(Bundle bundle) {
        Uri uri = this.as;
        if (uri != null) {
            bundle.putParcelable("arg_image_uri", uri);
        }
        Uri uri2 = this.aj;
        if (uri2 != null) {
            bundle.putParcelable("arg_crop_uri", uri2);
        }
        String str = this.ak;
        if (str != null) {
            bundle.putString("arg_external_channel_id", str);
        }
        String str2 = this.al;
        if (str2 != null) {
            bundle.putString("arg_encrypted_blob_id", str2);
        }
        if (this.at) {
            bundle.putBoolean("arg_get_image_finished", true);
        }
        if (this.au) {
            bundle.putBoolean("arg_crop_image_finished", true);
        }
        if (this.am) {
            bundle.putBoolean("arg_dismissed", true);
        }
        UploadPhotoEndpointOuterClass$UploadPhotoEndpoint uploadPhotoEndpointOuterClass$UploadPhotoEndpoint = this.ar;
        if (uploadPhotoEndpointOuterClass$UploadPhotoEndpoint != null) {
            bundle.putByteArray("arg_upload_photo_endpoint", uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.toByteArray());
        }
    }

    public final void p(String str, wdu wduVar) {
        this.am = true;
        this.ag.d(str);
        this.a.h(wduVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r(UploadPhotoEndpointOuterClass$UploadPhotoEndpoint uploadPhotoEndpointOuterClass$UploadPhotoEndpoint) {
        aqyg aqygVar;
        uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.getClass();
        this.ar = uploadPhotoEndpointOuterClass$UploadPhotoEndpoint;
        if (this.al != null) {
            q();
            return;
        }
        aoub aoubVar = this.ai.a().x;
        if (aoubVar == null) {
            aoubVar = aoub.a;
        }
        if (aoubVar.b) {
            r1 = !((uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.b & 4) != 0);
        } else {
            int i = uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.b;
            if ((i & 4) == 0 || (i & 8) == 0) {
                r1 = true;
            }
        }
        if (r1) {
            if ((uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.b & 256) != 0) {
                aqygVar = uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.i;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            p(ajcq.b(aqygVar).toString(), new wdu("UploadUrl or ExternalChannelId was not set."));
            return;
        }
        String str = uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.e;
        this.ak = (uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.b & 8) != 0 ? uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.f : "";
        this.c.execute(new wdx(this, str, uploadPhotoEndpointOuterClass$UploadPhotoEndpoint));
    }

    public final void s(int i) {
        aqyg aqygVar;
        aavf aavfVar = this.e;
        String str = this.ak;
        String str2 = this.al;
        aauz aauzVar = new aauz(aavfVar.f, aavfVar.a, null, null, null);
        ((aava) aauzVar).c = str;
        aauzVar.a = str2;
        aauzVar.b = i;
        try {
            this.e.a(aauzVar).get();
            aH();
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            UploadPhotoEndpointOuterClass$UploadPhotoEndpoint uploadPhotoEndpointOuterClass$UploadPhotoEndpoint = this.ar;
            if ((uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.b & 256) != 0) {
                aqygVar = uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.i;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            p(ajcq.b(aqygVar).toString(), new wdu(e));
        }
    }

    public final void q() {
        UploadPhotoEndpointOuterClass$UploadPhotoEndpoint uploadPhotoEndpointOuterClass$UploadPhotoEndpoint = this.ar;
        int i = uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.c;
        if (i == 3) {
            this.ae.a((apxf) uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.d);
        } else if (i != 2) {
            aH();
        } else {
            this.ae.a((apxf) uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.d);
        }
    }

    @Override // defpackage.ce
    public final void T(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i != 1) {
                if (i == 2) {
                    this.au = true;
                    aJ();
                    return;
                } else {
                    p(qX().getString(R.string.image_upload_something_went_wrong), new wdu("Unknown activity request code"));
                    return;
                }
            }
            Uri uri = this.as;
            if (uri == null) {
                uri = intent.getData();
            }
            this.as = uri;
            if (uri == null) {
                p(qX().getString(R.string.image_upload_something_went_wrong), new wdu("Failed to get image uri"));
                return;
            } else {
                this.at = true;
                aG();
                return;
            }
        }
        if (i2 == 0) {
            aI();
            return;
        }
        if (i != 2 || i2 != 2) {
            p(qX().getString(R.string.image_upload_something_went_wrong), new wdu("Unknown activity result code"));
            return;
        }
        arbo arboVar = this.aq.e;
        if (arboVar == null) {
            arboVar = arbo.a;
        }
        int i3 = arboVar.e;
        arbo arboVar2 = this.aq.e;
        if (arboVar2 == null) {
            arboVar2 = arbo.a;
        }
        int i4 = arboVar2.f;
        String string = qX().getString(R.string.crop_image_too_small, Integer.valueOf(i3), Integer.valueOf(i4));
        StringBuilder sb = new StringBuilder(69);
        sb.append("Selected image is too small. Must be at least ");
        sb.append(i3);
        sb.append("x");
        sb.append(i4);
        p(string, new wdu(sb.toString()));
    }
}
