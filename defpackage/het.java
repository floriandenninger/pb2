package defpackage;

import android.accounts.OperationCanceledException;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.provider.MediaStore;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera.GreenScreenMediaPickerView;
import com.google.android.apps.youtube.app.extensions.reel.edit.presenter.EditorButtonView;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import com.google.android.youtube.R;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class het implements View.OnClickListener, hdg, hkp, hlh {
    public static final amru a = amru.r(128644);
    public static final amru b = amru.t(128645, 127900, 127081);
    private final Executor A;
    private final Executor B;
    private int C;
    private final zoj D;
    public final List c;
    public final EditorButtonView d;
    public final boolean e;
    public final Context f;
    public final ci g;
    final zys h;
    final zys i;
    final View j;
    final View k;
    final View l;
    final GreenScreenMediaPickerView m;
    public final View n;
    public final hdi o;
    public how p;
    public List q;
    public final HashMap r = new HashMap();
    public final jqr s;
    public heg t;
    private final View u;
    private final hkq v;
    private final Drawable w;
    private final Drawable x;
    private final int y;
    private final int z;

    public het(List list, EditorButtonView editorButtonView, int i, int i2, jqr jqrVar, boolean z, Context context, ci ciVar, hkq hkqVar, Executor executor, Executor executor2, byte[] bArr) {
        this.c = list;
        this.d = editorButtonView;
        this.y = i;
        this.z = i2;
        this.s = jqrVar;
        this.e = z;
        this.f = context;
        this.g = ciVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.green_screen_allow_access, (ViewGroup) null);
        this.j = inflate;
        View findViewById = inflate.findViewById(R.id.green_screen_allow_access_button);
        this.u = findViewById;
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.green_screen_media_picker_bottom_sheet_layout, (ViewGroup) null);
        this.k = inflate2;
        this.l = inflate2.findViewById(R.id.green_screen_no_media_view);
        GreenScreenMediaPickerView greenScreenMediaPickerView = (GreenScreenMediaPickerView) inflate2.findViewById(R.id.green_screen_media_picker_view);
        this.m = greenScreenMediaPickerView;
        this.n = LayoutInflater.from(context).inflate(R.layout.green_screen_gallery_picker_bottom_sheet_layout, (ViewGroup) null);
        hdi hdiVar = new hdi(context, greenScreenMediaPickerView.a, greenScreenMediaPickerView.b, executor, executor2);
        this.o = hdiVar;
        this.w = nz.b(context, R.drawable.ic_green_screen_on);
        this.x = nz.b(context, R.drawable.ic_green_screen_off);
        this.v = hkqVar;
        hes hesVar = new hes(this, context, ciVar.getSupportFragmentManager(), jqrVar.a);
        hesVar.F(context.getString(R.string.camera_green_screen_done));
        this.h = hesVar;
        this.i = new her(this, context, ciVar.getSupportFragmentManager(), jqrVar.a, Optional.empty());
        this.A = executor;
        this.B = executor2;
        this.D = new zoj(context);
        h(false, false);
        editorButtonView.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        hdiVar.g = this;
        hdiVar.m = jqrVar;
        hkqVar.g = this;
        hkqVar.e();
    }

    private final void k(boolean z) {
        Drawable drawable;
        hkq hkqVar = this.v;
        hkqVar.a = z;
        if (!z) {
            hkqVar.d = "";
            hkqVar.f();
        }
        hkqVar.d();
        Drawable drawable2 = this.w;
        if (drawable2 == null || (drawable = this.x) == null) {
            return;
        }
        EditorButtonView editorButtonView = this.d;
        if (true != z) {
            drawable2 = drawable;
        }
        editorButtonView.b(drawable2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(List list) {
        amxe it = ((amru) list).iterator();
        while (it.hasNext()) {
            this.s.a(acsb.c(((Integer) it.next()).intValue())).a();
        }
        this.q = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(boolean z) {
        List list = this.q;
        if (list == null) {
            return;
        }
        amxe it = ((amru) list).iterator();
        while (it.hasNext()) {
            hfq a2 = this.s.a(acsb.c(((Integer) it.next()).intValue()));
            a2.h(z);
            a2.g();
        }
    }

    public final void d(Throwable th, hdh hdhVar) {
        if (hdhVar != null) {
            hdhVar.b();
        }
        this.o.c(null);
        etx.T(this.f, R.string.shorts_camera_green_screen_failed_loading);
        afsi.c(1, 6, "[ShortsCreation][Android][Camera]Failed to save green screen media", th);
    }

    public final void f(final DeviceLocalFile deviceLocalFile, final hdh hdhVar, boolean z) {
        hgh hghVar;
        if (this.p == null) {
            return;
        }
        boolean z2 = false;
        if (deviceLocalFile == null) {
            k(false);
            return;
        }
        File file = (File) this.r.get(deviceLocalFile);
        String str = null;
        if ((file != null && file.exists()) || this.p == null) {
            if (hdhVar != null) {
                hdhVar.b();
            }
            hkq hkqVar = this.v;
            if (file != null && file.exists()) {
                str = file.getPath();
            }
            hkqVar.b(str);
            if (file != null && file.exists()) {
                z2 = true;
            }
            k(z2);
            return;
        }
        if (z) {
            if (hdhVar != null && (hghVar = hdhVar.c) != null) {
                hghVar.c();
            }
            int i = this.C;
            this.C = i + 1;
            final String valueOf = String.valueOf(i);
            final how howVar = this.p;
            final ContentResolver contentResolver = this.f.getContentResolver();
            Executor executor = this.A;
            final int i2 = this.z;
            final int i3 = this.y;
            ynm.k(anaf.S(new Callable() { // from class: hdk
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bitmap bitmap;
                    how howVar2 = how.this;
                    DeviceLocalFile deviceLocalFile2 = deviceLocalFile;
                    ContentResolver contentResolver2 = contentResolver;
                    int i4 = i2;
                    int i5 = i3;
                    String str2 = valueOf;
                    File file2 = null;
                    if (howVar2 != null) {
                        try {
                            if (Build.VERSION.SDK_INT >= 29) {
                                bitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(contentResolver2, deviceLocalFile2.f()));
                            } else {
                                bitmap = MediaStore.Images.Media.getBitmap(contentResolver2, deviceLocalFile2.f());
                            }
                        } catch (IOException e) {
                            afsi.c(1, 6, "[ShortsCreation][Android][Camera]Failed loading image", e);
                            bitmap = null;
                        }
                        double d = i4;
                        double d2 = i5;
                        Double.isNaN(d);
                        Double.isNaN(d2);
                        Bitmap L = fhe.L(bitmap, d / d2);
                        Bitmap createScaledBitmap = L == null ? null : Bitmap.createScaledBitmap(L, i5, i4, true);
                        String valueOf2 = String.valueOf(str2);
                        File l = howVar2.l(valueOf2.length() != 0 ? "green_screen_image".concat(valueOf2) : new String("green_screen_image"));
                        try {
                            fkc.x(createScaledBitmap, l, Bitmap.CompressFormat.PNG);
                            file2 = l;
                        } catch (IOException e2) {
                            zga.f("ShortsProject", "Error saving green screen background image", e2);
                            afsi.c(2, 6, "[ShortsCreation][Android][ProjectState]Error saving green screen background image", e2);
                        }
                    }
                    return ammv.i(file2);
                }
            }, executor), this.B, new ynk() { // from class: hen
                @Override // defpackage.zfi
                /* renamed from: b */
                public final void a(Throwable th) {
                    het.this.d(th, hdhVar);
                }
            }, new ynl() { // from class: heo
                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj) {
                    het hetVar = het.this;
                    DeviceLocalFile deviceLocalFile2 = deviceLocalFile;
                    hdh hdhVar2 = hdhVar;
                    ammv ammvVar = (ammv) obj;
                    if (!ammvVar.h()) {
                        hetVar.d(new IOException("Null file returned from save"), hdhVar2);
                        return;
                    }
                    hetVar.r.put(deviceLocalFile2, (File) ammvVar.c());
                    if (deviceLocalFile2.equals(hetVar.o.f)) {
                        hetVar.f(deviceLocalFile2, hdhVar2, false);
                        return;
                    }
                    if (hdhVar2 != null) {
                        hdhVar2.b();
                    }
                    zga.g("Selected green screen media has changed.");
                }
            });
            return;
        }
        f(null, hdhVar, false);
    }

    @Override // defpackage.hlh
    public final void g(DeviceLocalFile deviceLocalFile) {
        this.i.z();
        this.o.c(deviceLocalFile);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(final boolean z, final boolean z2) {
        if (j()) {
            final zoj zojVar = this.D;
            ynm.k(anaf.S(new Callable() { // from class: hdm
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zoj.this.c(1);
                }
            }, this.A), this.B, new ynk() { // from class: hem
                @Override // defpackage.zfi
                /* renamed from: b */
                public final void a(Throwable th) {
                    het.this.i(null, false, false);
                    afsi.c(1, 6, "[ShortsCreation][Android][Camera]Failed to load green screen media list", th);
                }
            }, new ynl() { // from class: hep
                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj) {
                    het.this.i((List) obj, z, z2);
                }
            });
        }
    }

    public final void i(List list, boolean z, boolean z2) {
        final int i = 0;
        if (list == null || list.isEmpty()) {
            this.l.setVisibility(0);
            this.m.setVisibility(4);
            k(false);
            return;
        }
        this.l.setVisibility(4);
        this.m.setVisibility(0);
        k(z);
        final hdi hdiVar = this.o;
        hdiVar.h = list;
        hdiVar.c.removeAllViews();
        hdiVar.e.clear();
        final int i2 = 1;
        if (hdiVar.i == null) {
            View a2 = hdiVar.a(R.layout.green_screen_deselect_list_item);
            if (a2 != null) {
                a2.setOnClickListener(new View.OnClickListener() { // from class: hdc
                    /* JADX WARN: Type inference failed for: r1v0, types: [hlh, hdg] */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        het hetVar;
                        zys zysVar;
                        if (i2 != 0) {
                            hdi hdiVar2 = hdiVar;
                            hdiVar2.c(null);
                            jqr jqrVar = hdiVar2.m;
                            if (jqrVar != null) {
                                jqrVar.a(acsb.c(127081)).b();
                                return;
                            }
                            return;
                        }
                        hdi hdiVar3 = hdiVar;
                        ?? r1 = hdiVar3.g;
                        if (r1 != 0 && (zysVar = (hetVar = (het) r1).i) != null) {
                            zysVar.G();
                            hli hliVar = (hli) hetVar.i.y().f("nestedGreenScreenGalleryFragment");
                            if (hliVar == null) {
                                hliVar = hli.aG(true, R.string.camera_green_screen_label, false, 1, null);
                            }
                            hliVar.d = r1;
                            dn k = hetVar.i.y().k();
                            k.u(R.id.green_screen_media_picker_view, hliVar, "nestedGreenScreenGalleryFragment");
                            k.a();
                        }
                        jqr jqrVar2 = hdiVar3.m;
                        if (jqrVar2 != null) {
                            jqrVar2.a(acsb.c(127900)).b();
                        }
                    }
                });
            }
            if (a2 != null) {
                hdiVar.i = hdi.e(a2);
            }
        }
        hdh hdhVar = hdiVar.i;
        if (hdhVar != null) {
            hdiVar.c.addView(hdhVar.a);
        }
        for (final DeviceLocalFile deviceLocalFile : (List) Collection.EL.stream(hdiVar.h).limit(30L).collect(Collectors.toList())) {
            final View a3 = hdiVar.a(R.layout.green_screen_media_picker_list_item);
            View view = null;
            if (a3 == null) {
                a3 = null;
            } else {
                final int dimensionPixelSize = hdiVar.a.getResources().getDimensionPixelSize(R.dimen.green_screen_media_item_thumbnail_view_size);
                final ContentResolver contentResolver = hdiVar.a.getContentResolver();
                anhy l = amkq.l(new Callable() { // from class: hdl
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        DeviceLocalFile deviceLocalFile2 = DeviceLocalFile.this;
                        int i3 = dimensionPixelSize;
                        ContentResolver contentResolver2 = contentResolver;
                        Bitmap bitmap = null;
                        if (Build.VERSION.SDK_INT >= 29) {
                            try {
                                bitmap = contentResolver2.loadThumbnail(deviceLocalFile2.f(), new Size(i3, i3), null);
                            } catch (Exception e) {
                                if (!(e instanceof OperationCanceledException)) {
                                    afsi.c(1, 6, "[ShortsCreation][Android][Camera]Failed loading thumbnail", e);
                                }
                            }
                        } else {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.outHeight = i3;
                            options.outWidth = i3;
                            bitmap = MediaStore.Images.Thumbnails.getThumbnail(contentResolver2, deviceLocalFile2.c(), 1, options);
                        }
                        return ammv.i(fhe.L(bitmap, 1.0d));
                    }
                }, hdiVar.k);
                if (deviceLocalFile.a() == 0) {
                    TextView textView = (TextView) a3.findViewById(R.id.video_duration_label);
                    long b2 = deviceLocalFile.b();
                    textView.setText(b2 > zws.a ? zws.a(deviceLocalFile.b()) : "0:00");
                    textView.setVisibility(b2 > 0 ? 0 : 8);
                }
                ynm.k(l, hdiVar.l, gwr.c, new ynl() { // from class: hde
                    @Override // defpackage.ynl, defpackage.zfi
                    public final void a(Object obj) {
                        View view2 = a3;
                        ((ImageView) view2.findViewById(R.id.green_screen_media_item_thumbnail)).setImageBitmap((Bitmap) ((ammv) obj).f());
                    }
                });
            }
            if (a3 != null) {
                hdiVar.e.put(deviceLocalFile, hdi.e(a3));
                a3.setContentDescription(deviceLocalFile.h());
                if (deviceLocalFile.a() == 1 || deviceLocalFile.a() == 2) {
                    a3.setOnClickListener(new View.OnClickListener() { // from class: hdd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            hdi hdiVar2 = hdi.this;
                            DeviceLocalFile deviceLocalFile2 = deviceLocalFile;
                            if (true == deviceLocalFile2.equals(hdiVar2.f)) {
                                deviceLocalFile2 = null;
                            }
                            hdiVar2.c(deviceLocalFile2);
                            jqr jqrVar = hdiVar2.m;
                            if (jqrVar != null) {
                                jqrVar.a(acsb.c(128645)).b();
                            }
                        }
                    });
                }
                view = a3;
            }
            if (view != null) {
                hdiVar.c.addView(view);
            }
        }
        if (hdiVar.h.size() > 30) {
            if (hdiVar.j == null) {
                View a4 = hdiVar.a(R.layout.green_screen_more_media_list_item);
                if (a4 != null) {
                    a4.setOnClickListener(new View.OnClickListener() { // from class: hdc
                        /* JADX WARN: Type inference failed for: r1v0, types: [hlh, hdg] */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            het hetVar;
                            zys zysVar;
                            if (i != 0) {
                                hdi hdiVar2 = hdiVar;
                                hdiVar2.c(null);
                                jqr jqrVar = hdiVar2.m;
                                if (jqrVar != null) {
                                    jqrVar.a(acsb.c(127081)).b();
                                    return;
                                }
                                return;
                            }
                            hdi hdiVar3 = hdiVar;
                            ?? r1 = hdiVar3.g;
                            if (r1 != 0 && (zysVar = (hetVar = (het) r1).i) != null) {
                                zysVar.G();
                                hli hliVar = (hli) hetVar.i.y().f("nestedGreenScreenGalleryFragment");
                                if (hliVar == null) {
                                    hliVar = hli.aG(true, R.string.camera_green_screen_label, false, 1, null);
                                }
                                hliVar.d = r1;
                                dn k = hetVar.i.y().k();
                                k.u(R.id.green_screen_media_picker_view, hliVar, "nestedGreenScreenGalleryFragment");
                                k.a();
                            }
                            jqr jqrVar2 = hdiVar3.m;
                            if (jqrVar2 != null) {
                                jqrVar2.a(acsb.c(127900)).b();
                            }
                        }
                    });
                }
                hdiVar.j = a4;
            }
            View view2 = hdiVar.j;
            if (view2 != null) {
                hdiVar.c.addView(view2);
            }
        }
        if (hdiVar.c.getChildCount() > 0) {
            int dimensionPixelSize2 = hdiVar.a.getResources().getDimensionPixelSize(R.dimen.green_screen_media_item_first_last_item_margin);
            View childAt = hdiVar.c.getChildAt(0);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.setMarginStart(dimensionPixelSize2);
            childAt.setLayoutParams(layoutParams);
            View childAt2 = hdiVar.c.getChildAt(r2.getChildCount() - 1);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
            layoutParams2.setMarginEnd(dimensionPixelSize2);
            childAt2.setLayoutParams(layoutParams2);
        }
        DeviceLocalFile deviceLocalFile2 = hdiVar.f;
        hdiVar.d(deviceLocalFile2, false, deviceLocalFile2 != null);
        if (z2) {
            this.s.b(acsb.b(127083)).b();
            b(b);
            c(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean j() {
        return zxo.e(this.g, 0);
    }

    @Override // defpackage.hlh
    public final void lU() {
        this.i.z();
    }

    @Override // defpackage.hlh
    public final void lV() {
        heg hegVar = this.t;
        if (hegVar != null) {
            hegVar.d();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.d) {
            this.s.a(acsb.c(127070)).b();
            zys zysVar = this.h;
            if (zysVar != null) {
                zysVar.G();
                return;
            }
            return;
        }
        if (view == this.u) {
            zys zysVar2 = this.h;
            if (zysVar2 != null) {
                zysVar2.z();
            }
            heg hegVar = this.t;
            if (hegVar != null) {
                hegVar.d();
            }
            this.s.a(acsb.c(128644)).b();
        }
    }
}
