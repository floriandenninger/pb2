package com.google.android.libraries.user.profile.photopicker.edit;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.AppCompatImageButton;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.libraries.user.profile.photopicker.common.view.error.FullscreenErrorView;
import com.google.android.libraries.user.profile.photopicker.edit.EditActivity;
import com.google.android.libraries.user.profile.photopicker.edit.EditablePhotoView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.youtube.R;
import defpackage.amnp;
import defpackage.amsj;
import defpackage.aoae;
import defpackage.aofi;
import defpackage.aogv;
import defpackage.aone;
import defpackage.aox;
import defpackage.aps;
import defpackage.axpj;
import defpackage.axxp;
import defpackage.con;
import defpackage.csk;
import defpackage.dn;
import defpackage.lu;
import defpackage.sgf;
import defpackage.tfy;
import defpackage.tga;
import defpackage.tgc;
import defpackage.tgd;
import defpackage.tgn;
import defpackage.tis;
import defpackage.vkb;
import defpackage.vkc;
import defpackage.vls;
import defpackage.vlx;
import defpackage.vnp;
import defpackage.vnq;
import defpackage.vnr;
import defpackage.vnt;
import defpackage.voa;
import defpackage.voh;
import defpackage.vrn;
import java.io.DataOutputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class EditActivity extends voa implements axpj {
    public aps a;
    public vrn b;
    public String c;
    public vkb d;
    public tgn e;
    public tgd f;
    public vnr g;
    public tis h;
    public voh i;
    public MaterialButton j;
    public AppCompatImageButton k;
    public EditablePhotoView l;
    public LinearProgressIndicator m;
    public FullscreenErrorView n;
    public BottomSheetBehavior o;
    public tga p;
    public amsj q;

    public final void a() {
        this.j.setEnabled(false);
        this.k.setEnabled(false);
    }

    public final void b() {
        this.j.setEnabled(true);
        this.k.setEnabled(true);
    }

    public final void c() {
        this.m.setVisibility(8);
        this.o.G(5);
        this.l.setVisibility(8);
        this.n.setVisibility(8);
    }

    public final void f(Uri uri) {
        vnr vnrVar = this.g;
        amnp amnpVar = vnrVar.c;
        amnpVar.e();
        amnpVar.f();
        vlx vlxVar = vnrVar.a;
        aone createBuilder = aofi.a.createBuilder();
        int i = vnrVar.e;
        createBuilder.copyOnWrite();
        aofi aofiVar = (aofi) createBuilder.instance;
        aofiVar.c = 4;
        aofiVar.b |= 1;
        vlxVar.d((aofi) createBuilder.build());
        int c = (int) axxp.a.get().c();
        vkb vkbVar = this.d;
        aoae aoaeVar = new aoae((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        aoaeVar.b.add(vkc.CENTER_INSIDE);
        vnp vnpVar = new vnp(this, c, c);
        vnq vnqVar = new vnq(this);
        con a = vkbVar.a(this, uri, aoaeVar);
        if (vkb.a.contains(uri.getScheme())) {
            a = (con) ((con) a.u(csk.a)).T();
        }
        ((con) a.a(vnqVar).s()).q(vnpVar);
    }

    @Override // defpackage.axpj
    public final amsj g() {
        return this.q;
    }

    @Override // defpackage.zv, android.app.Activity
    public final void onBackPressed() {
        this.g.a(aogv.CANCELLED);
        super.onBackPressed();
    }

    @Override // defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public final void onCreate(Bundle bundle) {
        vls.d(this);
        super.onCreate(bundle);
        vnr vnrVar = this.g;
        vnrVar.b.f();
        vlx vlxVar = vnrVar.a;
        aone createBuilder = aofi.a.createBuilder();
        int i = vnrVar.d;
        createBuilder.copyOnWrite();
        aofi aofiVar = (aofi) createBuilder.instance;
        final int i2 = 3;
        aofiVar.c = 3;
        final int i3 = 1;
        aofiVar.b |= 1;
        vlxVar.d((aofi) createBuilder.build());
        if (!this.b.b() || getIntent().getData() == null) {
            this.g.a(aogv.INVALID_ARGUMENT);
            finish();
            return;
        }
        setContentView(R.layout.photo_picker_edit_activity);
        tfy a = this.e.a.a(89757);
        a.d(sgf.Q(this.c));
        a.d(sgf.G());
        a.e(this.p);
        a.c(this);
        if (axxp.a.get().o()) {
            this.e.a.a(89741).a(findViewById(R.id.photo_picker_edit_page));
        }
        Toolbar toolbar = (Toolbar) findViewById(R.id.photo_picker_toolbar);
        setSupportActionBar(toolbar);
        lu supportActionBar = getSupportActionBar();
        supportActionBar.getClass();
        supportActionBar.j(true);
        supportActionBar.A();
        supportActionBar.o(R.string.op3_edit_crop_and_rotate);
        tis d = tis.d(this.e.a.a(92715).a(toolbar));
        this.h = d;
        d.c(89729).a(Integer.valueOf(R.id.photo_picker_navigation_button));
        toolbar.r(new View.OnClickListener(this) { // from class: vnm
            public final /* synthetic */ EditActivity a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final Bitmap createBitmap;
                int i4 = i2;
                if (i4 == 0) {
                    EditActivity editActivity = this.a;
                    final EditablePhotoView editablePhotoView = editActivity.l;
                    ValueAnimator valueAnimator = editablePhotoView.m;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        final Matrix matrix = new Matrix(editablePhotoView.b);
                        editablePhotoView.m = ValueAnimator.ofFloat(0.0f, -90.0f);
                        editablePhotoView.m.setInterpolator(new anq());
                        editablePhotoView.m.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: vnu
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                EditablePhotoView editablePhotoView2 = EditablePhotoView.this;
                                Matrix matrix2 = matrix;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                editablePhotoView2.b.set(matrix2);
                                editablePhotoView2.b.postRotate(floatValue, editablePhotoView2.c.centerX(), editablePhotoView2.c.centerY());
                                editablePhotoView2.invalidate();
                                editablePhotoView2.g();
                            }
                        });
                        editablePhotoView.m.addListener(new vnx(editablePhotoView, matrix));
                        editablePhotoView.m.setDuration(axxp.a.get().e());
                        editablePhotoView.m.start();
                    }
                    editActivity.f.a(tgc.a(), editActivity.k);
                    return;
                }
                if (i4 != 1) {
                    if (i4 == 2) {
                        EditActivity editActivity2 = this.a;
                        editActivity2.f(editActivity2.getIntent().getData());
                        return;
                    } else {
                        EditActivity editActivity3 = this.a;
                        editActivity3.f.b(tgc.a(), editActivity3.h.b(Integer.valueOf(R.id.photo_picker_navigation_button)));
                        editActivity3.onBackPressed();
                        return;
                    }
                }
                EditActivity editActivity4 = this.a;
                vnr vnrVar2 = editActivity4.g;
                vlx vlxVar2 = vnrVar2.a;
                aone createBuilder2 = aofi.a.createBuilder();
                int i5 = vnrVar2.f;
                createBuilder2.copyOnWrite();
                aofi aofiVar2 = (aofi) createBuilder2.instance;
                aofiVar2.c = 5;
                aofiVar2.b |= 1;
                vlxVar2.d((aofi) createBuilder2.build());
                final voh vohVar = editActivity4.i;
                EditablePhotoView editablePhotoView2 = editActivity4.l;
                int intrinsicHeight = editablePhotoView2.a.getIntrinsicHeight();
                int intrinsicWidth = editablePhotoView2.a.getIntrinsicWidth();
                int i6 = -editablePhotoView2.c.left;
                int i7 = -editablePhotoView2.c.top;
                float b = editablePhotoView2.b();
                float min = Math.min(intrinsicWidth / b, intrinsicHeight / b);
                if (min > ((float) axxp.a())) {
                    createBitmap = Bitmap.createBitmap((int) axxp.a(), (int) axxp.a(), Bitmap.Config.ARGB_8888);
                } else {
                    int i8 = (int) min;
                    createBitmap = Bitmap.createBitmap(i8, i8, Bitmap.Config.ARGB_8888);
                }
                Canvas canvas = new Canvas(createBitmap);
                Matrix matrix2 = new Matrix(editablePhotoView2.b);
                if (i6 + i7 != 0) {
                    matrix2.postTranslate(i6, i7);
                }
                float a2 = editablePhotoView2.a();
                if (a2 != 0.0f) {
                    float f = 1.0f / a2;
                    matrix2.postScale(f, f);
                }
                if (min > ((float) axxp.a())) {
                    matrix2.postScale(((float) axxp.a()) / min, ((float) axxp.a()) / min);
                }
                canvas.concat(matrix2);
                editablePhotoView2.a.draw(canvas);
                if (vohVar.g.compareAndSet(false, true)) {
                    amnp amnpVar = vohVar.e;
                    amnpVar.e();
                    amnpVar.f();
                    aow aowVar = vohVar.f;
                    voi a3 = voj.a();
                    a3.b = 2;
                    aowVar.j(a3.a());
                    anaf.Y(anaf.S(new Callable() { // from class: vof
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            voh vohVar2 = voh.this;
                            Bitmap bitmap = createBitmap;
                            Uri h = vohVar2.i.h("edited_photo.png");
                            wki wkiVar = vohVar2.h;
                            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
                            bitmap.copyPixelsToBuffer(allocate);
                            byte[] array = allocate.array();
                            DataOutputStream dataOutputStream = new DataOutputStream(uzm.c(wkiVar.a.a, h, uzl.b));
                            try {
                                dataOutputStream.writeInt(array.length);
                                dataOutputStream.writeInt(bitmap.getWidth());
                                dataOutputStream.writeInt(bitmap.getHeight());
                                dataOutputStream.writeUTF(bitmap.getConfig().toString());
                                dataOutputStream.write(array);
                                dataOutputStream.close();
                                return h;
                            } catch (Throwable th) {
                                try {
                                    dataOutputStream.close();
                                } catch (Throwable unused) {
                                }
                                throw th;
                            }
                        }
                    }, vohVar.c), new vog(vohVar), vohVar.c);
                }
                editActivity4.f.a(tgc.a(), editActivity4.j);
            }
        });
        this.j = (MaterialButton) findViewById(R.id.photo_picker_accept_button);
        this.k = (AppCompatImageButton) findViewById(R.id.photo_picker_edit_rotate_button);
        this.l = (EditablePhotoView) findViewById(R.id.photo_picker_photo_edit_view);
        this.m = (LinearProgressIndicator) findViewById(R.id.photo_picker_loading_view);
        this.n = (FullscreenErrorView) findViewById(R.id.photo_picker_error_view);
        this.e.a.a(97816).a(this.l);
        BottomSheetBehavior x = BottomSheetBehavior.x((ConstraintLayout) findViewById(R.id.photo_picker_edit_bottom_sheet));
        this.o = x;
        final int i4 = 0;
        x.s = false;
        x.E(true);
        this.o.G(5);
        this.i = (voh) this.a.a(voh.class);
        f(getIntent().getData());
        this.e.a.a(89765).a(this.j);
        this.j.setOnClickListener(new View.OnClickListener(this) { // from class: vnm
            public final /* synthetic */ EditActivity a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final Bitmap createBitmap;
                int i42 = i3;
                if (i42 == 0) {
                    EditActivity editActivity = this.a;
                    final EditablePhotoView editablePhotoView = editActivity.l;
                    ValueAnimator valueAnimator = editablePhotoView.m;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        final Matrix matrix = new Matrix(editablePhotoView.b);
                        editablePhotoView.m = ValueAnimator.ofFloat(0.0f, -90.0f);
                        editablePhotoView.m.setInterpolator(new anq());
                        editablePhotoView.m.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: vnu
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                EditablePhotoView editablePhotoView2 = EditablePhotoView.this;
                                Matrix matrix2 = matrix;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                editablePhotoView2.b.set(matrix2);
                                editablePhotoView2.b.postRotate(floatValue, editablePhotoView2.c.centerX(), editablePhotoView2.c.centerY());
                                editablePhotoView2.invalidate();
                                editablePhotoView2.g();
                            }
                        });
                        editablePhotoView.m.addListener(new vnx(editablePhotoView, matrix));
                        editablePhotoView.m.setDuration(axxp.a.get().e());
                        editablePhotoView.m.start();
                    }
                    editActivity.f.a(tgc.a(), editActivity.k);
                    return;
                }
                if (i42 != 1) {
                    if (i42 == 2) {
                        EditActivity editActivity2 = this.a;
                        editActivity2.f(editActivity2.getIntent().getData());
                        return;
                    } else {
                        EditActivity editActivity3 = this.a;
                        editActivity3.f.b(tgc.a(), editActivity3.h.b(Integer.valueOf(R.id.photo_picker_navigation_button)));
                        editActivity3.onBackPressed();
                        return;
                    }
                }
                EditActivity editActivity4 = this.a;
                vnr vnrVar2 = editActivity4.g;
                vlx vlxVar2 = vnrVar2.a;
                aone createBuilder2 = aofi.a.createBuilder();
                int i5 = vnrVar2.f;
                createBuilder2.copyOnWrite();
                aofi aofiVar2 = (aofi) createBuilder2.instance;
                aofiVar2.c = 5;
                aofiVar2.b |= 1;
                vlxVar2.d((aofi) createBuilder2.build());
                final voh vohVar = editActivity4.i;
                EditablePhotoView editablePhotoView2 = editActivity4.l;
                int intrinsicHeight = editablePhotoView2.a.getIntrinsicHeight();
                int intrinsicWidth = editablePhotoView2.a.getIntrinsicWidth();
                int i6 = -editablePhotoView2.c.left;
                int i7 = -editablePhotoView2.c.top;
                float b = editablePhotoView2.b();
                float min = Math.min(intrinsicWidth / b, intrinsicHeight / b);
                if (min > ((float) axxp.a())) {
                    createBitmap = Bitmap.createBitmap((int) axxp.a(), (int) axxp.a(), Bitmap.Config.ARGB_8888);
                } else {
                    int i8 = (int) min;
                    createBitmap = Bitmap.createBitmap(i8, i8, Bitmap.Config.ARGB_8888);
                }
                Canvas canvas = new Canvas(createBitmap);
                Matrix matrix2 = new Matrix(editablePhotoView2.b);
                if (i6 + i7 != 0) {
                    matrix2.postTranslate(i6, i7);
                }
                float a2 = editablePhotoView2.a();
                if (a2 != 0.0f) {
                    float f = 1.0f / a2;
                    matrix2.postScale(f, f);
                }
                if (min > ((float) axxp.a())) {
                    matrix2.postScale(((float) axxp.a()) / min, ((float) axxp.a()) / min);
                }
                canvas.concat(matrix2);
                editablePhotoView2.a.draw(canvas);
                if (vohVar.g.compareAndSet(false, true)) {
                    amnp amnpVar = vohVar.e;
                    amnpVar.e();
                    amnpVar.f();
                    aow aowVar = vohVar.f;
                    voi a3 = voj.a();
                    a3.b = 2;
                    aowVar.j(a3.a());
                    anaf.Y(anaf.S(new Callable() { // from class: vof
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            voh vohVar2 = voh.this;
                            Bitmap bitmap = createBitmap;
                            Uri h = vohVar2.i.h("edited_photo.png");
                            wki wkiVar = vohVar2.h;
                            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
                            bitmap.copyPixelsToBuffer(allocate);
                            byte[] array = allocate.array();
                            DataOutputStream dataOutputStream = new DataOutputStream(uzm.c(wkiVar.a.a, h, uzl.b));
                            try {
                                dataOutputStream.writeInt(array.length);
                                dataOutputStream.writeInt(bitmap.getWidth());
                                dataOutputStream.writeInt(bitmap.getHeight());
                                dataOutputStream.writeUTF(bitmap.getConfig().toString());
                                dataOutputStream.write(array);
                                dataOutputStream.close();
                                return h;
                            } catch (Throwable th) {
                                try {
                                    dataOutputStream.close();
                                } catch (Throwable unused) {
                                }
                                throw th;
                            }
                        }
                    }, vohVar.c), new vog(vohVar), vohVar.c);
                }
                editActivity4.f.a(tgc.a(), editActivity4.j);
            }
        });
        this.e.a.a(89764).a(this.k);
        this.k.setOnClickListener(new View.OnClickListener(this) { // from class: vnm
            public final /* synthetic */ EditActivity a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final Bitmap createBitmap;
                int i42 = i4;
                if (i42 == 0) {
                    EditActivity editActivity = this.a;
                    final EditablePhotoView editablePhotoView = editActivity.l;
                    ValueAnimator valueAnimator = editablePhotoView.m;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        final Matrix matrix = new Matrix(editablePhotoView.b);
                        editablePhotoView.m = ValueAnimator.ofFloat(0.0f, -90.0f);
                        editablePhotoView.m.setInterpolator(new anq());
                        editablePhotoView.m.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: vnu
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                EditablePhotoView editablePhotoView2 = EditablePhotoView.this;
                                Matrix matrix2 = matrix;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                editablePhotoView2.b.set(matrix2);
                                editablePhotoView2.b.postRotate(floatValue, editablePhotoView2.c.centerX(), editablePhotoView2.c.centerY());
                                editablePhotoView2.invalidate();
                                editablePhotoView2.g();
                            }
                        });
                        editablePhotoView.m.addListener(new vnx(editablePhotoView, matrix));
                        editablePhotoView.m.setDuration(axxp.a.get().e());
                        editablePhotoView.m.start();
                    }
                    editActivity.f.a(tgc.a(), editActivity.k);
                    return;
                }
                if (i42 != 1) {
                    if (i42 == 2) {
                        EditActivity editActivity2 = this.a;
                        editActivity2.f(editActivity2.getIntent().getData());
                        return;
                    } else {
                        EditActivity editActivity3 = this.a;
                        editActivity3.f.b(tgc.a(), editActivity3.h.b(Integer.valueOf(R.id.photo_picker_navigation_button)));
                        editActivity3.onBackPressed();
                        return;
                    }
                }
                EditActivity editActivity4 = this.a;
                vnr vnrVar2 = editActivity4.g;
                vlx vlxVar2 = vnrVar2.a;
                aone createBuilder2 = aofi.a.createBuilder();
                int i5 = vnrVar2.f;
                createBuilder2.copyOnWrite();
                aofi aofiVar2 = (aofi) createBuilder2.instance;
                aofiVar2.c = 5;
                aofiVar2.b |= 1;
                vlxVar2.d((aofi) createBuilder2.build());
                final voh vohVar = editActivity4.i;
                EditablePhotoView editablePhotoView2 = editActivity4.l;
                int intrinsicHeight = editablePhotoView2.a.getIntrinsicHeight();
                int intrinsicWidth = editablePhotoView2.a.getIntrinsicWidth();
                int i6 = -editablePhotoView2.c.left;
                int i7 = -editablePhotoView2.c.top;
                float b = editablePhotoView2.b();
                float min = Math.min(intrinsicWidth / b, intrinsicHeight / b);
                if (min > ((float) axxp.a())) {
                    createBitmap = Bitmap.createBitmap((int) axxp.a(), (int) axxp.a(), Bitmap.Config.ARGB_8888);
                } else {
                    int i8 = (int) min;
                    createBitmap = Bitmap.createBitmap(i8, i8, Bitmap.Config.ARGB_8888);
                }
                Canvas canvas = new Canvas(createBitmap);
                Matrix matrix2 = new Matrix(editablePhotoView2.b);
                if (i6 + i7 != 0) {
                    matrix2.postTranslate(i6, i7);
                }
                float a2 = editablePhotoView2.a();
                if (a2 != 0.0f) {
                    float f = 1.0f / a2;
                    matrix2.postScale(f, f);
                }
                if (min > ((float) axxp.a())) {
                    matrix2.postScale(((float) axxp.a()) / min, ((float) axxp.a()) / min);
                }
                canvas.concat(matrix2);
                editablePhotoView2.a.draw(canvas);
                if (vohVar.g.compareAndSet(false, true)) {
                    amnp amnpVar = vohVar.e;
                    amnpVar.e();
                    amnpVar.f();
                    aow aowVar = vohVar.f;
                    voi a3 = voj.a();
                    a3.b = 2;
                    aowVar.j(a3.a());
                    anaf.Y(anaf.S(new Callable() { // from class: vof
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            voh vohVar2 = voh.this;
                            Bitmap bitmap = createBitmap;
                            Uri h = vohVar2.i.h("edited_photo.png");
                            wki wkiVar = vohVar2.h;
                            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
                            bitmap.copyPixelsToBuffer(allocate);
                            byte[] array = allocate.array();
                            DataOutputStream dataOutputStream = new DataOutputStream(uzm.c(wkiVar.a.a, h, uzl.b));
                            try {
                                dataOutputStream.writeInt(array.length);
                                dataOutputStream.writeInt(bitmap.getWidth());
                                dataOutputStream.writeInt(bitmap.getHeight());
                                dataOutputStream.writeUTF(bitmap.getConfig().toString());
                                dataOutputStream.write(array);
                                dataOutputStream.close();
                                return h;
                            } catch (Throwable th) {
                                try {
                                    dataOutputStream.close();
                                } catch (Throwable unused) {
                                }
                                throw th;
                            }
                        }
                    }, vohVar.c), new vog(vohVar), vohVar.c);
                }
                editActivity4.f.a(tgc.a(), editActivity4.j);
            }
        });
        final FullscreenErrorView fullscreenErrorView = this.n;
        final int i5 = 2;
        final View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: vnm
            public final /* synthetic */ EditActivity a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final Bitmap createBitmap;
                int i42 = i5;
                if (i42 == 0) {
                    EditActivity editActivity = this.a;
                    final EditablePhotoView editablePhotoView = editActivity.l;
                    ValueAnimator valueAnimator = editablePhotoView.m;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        final Matrix matrix = new Matrix(editablePhotoView.b);
                        editablePhotoView.m = ValueAnimator.ofFloat(0.0f, -90.0f);
                        editablePhotoView.m.setInterpolator(new anq());
                        editablePhotoView.m.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: vnu
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                EditablePhotoView editablePhotoView2 = EditablePhotoView.this;
                                Matrix matrix2 = matrix;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                editablePhotoView2.b.set(matrix2);
                                editablePhotoView2.b.postRotate(floatValue, editablePhotoView2.c.centerX(), editablePhotoView2.c.centerY());
                                editablePhotoView2.invalidate();
                                editablePhotoView2.g();
                            }
                        });
                        editablePhotoView.m.addListener(new vnx(editablePhotoView, matrix));
                        editablePhotoView.m.setDuration(axxp.a.get().e());
                        editablePhotoView.m.start();
                    }
                    editActivity.f.a(tgc.a(), editActivity.k);
                    return;
                }
                if (i42 != 1) {
                    if (i42 == 2) {
                        EditActivity editActivity2 = this.a;
                        editActivity2.f(editActivity2.getIntent().getData());
                        return;
                    } else {
                        EditActivity editActivity3 = this.a;
                        editActivity3.f.b(tgc.a(), editActivity3.h.b(Integer.valueOf(R.id.photo_picker_navigation_button)));
                        editActivity3.onBackPressed();
                        return;
                    }
                }
                EditActivity editActivity4 = this.a;
                vnr vnrVar2 = editActivity4.g;
                vlx vlxVar2 = vnrVar2.a;
                aone createBuilder2 = aofi.a.createBuilder();
                int i52 = vnrVar2.f;
                createBuilder2.copyOnWrite();
                aofi aofiVar2 = (aofi) createBuilder2.instance;
                aofiVar2.c = 5;
                aofiVar2.b |= 1;
                vlxVar2.d((aofi) createBuilder2.build());
                final voh vohVar = editActivity4.i;
                EditablePhotoView editablePhotoView2 = editActivity4.l;
                int intrinsicHeight = editablePhotoView2.a.getIntrinsicHeight();
                int intrinsicWidth = editablePhotoView2.a.getIntrinsicWidth();
                int i6 = -editablePhotoView2.c.left;
                int i7 = -editablePhotoView2.c.top;
                float b = editablePhotoView2.b();
                float min = Math.min(intrinsicWidth / b, intrinsicHeight / b);
                if (min > ((float) axxp.a())) {
                    createBitmap = Bitmap.createBitmap((int) axxp.a(), (int) axxp.a(), Bitmap.Config.ARGB_8888);
                } else {
                    int i8 = (int) min;
                    createBitmap = Bitmap.createBitmap(i8, i8, Bitmap.Config.ARGB_8888);
                }
                Canvas canvas = new Canvas(createBitmap);
                Matrix matrix2 = new Matrix(editablePhotoView2.b);
                if (i6 + i7 != 0) {
                    matrix2.postTranslate(i6, i7);
                }
                float a2 = editablePhotoView2.a();
                if (a2 != 0.0f) {
                    float f = 1.0f / a2;
                    matrix2.postScale(f, f);
                }
                if (min > ((float) axxp.a())) {
                    matrix2.postScale(((float) axxp.a()) / min, ((float) axxp.a()) / min);
                }
                canvas.concat(matrix2);
                editablePhotoView2.a.draw(canvas);
                if (vohVar.g.compareAndSet(false, true)) {
                    amnp amnpVar = vohVar.e;
                    amnpVar.e();
                    amnpVar.f();
                    aow aowVar = vohVar.f;
                    voi a3 = voj.a();
                    a3.b = 2;
                    aowVar.j(a3.a());
                    anaf.Y(anaf.S(new Callable() { // from class: vof
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            voh vohVar2 = voh.this;
                            Bitmap bitmap = createBitmap;
                            Uri h = vohVar2.i.h("edited_photo.png");
                            wki wkiVar = vohVar2.h;
                            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
                            bitmap.copyPixelsToBuffer(allocate);
                            byte[] array = allocate.array();
                            DataOutputStream dataOutputStream = new DataOutputStream(uzm.c(wkiVar.a.a, h, uzl.b));
                            try {
                                dataOutputStream.writeInt(array.length);
                                dataOutputStream.writeInt(bitmap.getWidth());
                                dataOutputStream.writeInt(bitmap.getHeight());
                                dataOutputStream.writeUTF(bitmap.getConfig().toString());
                                dataOutputStream.write(array);
                                dataOutputStream.close();
                                return h;
                            } catch (Throwable th) {
                                try {
                                    dataOutputStream.close();
                                } catch (Throwable unused) {
                                }
                                throw th;
                            }
                        }
                    }, vohVar.c), new vog(vohVar), vohVar.c);
                }
                editActivity4.f.a(tgc.a(), editActivity4.j);
            }
        };
        fullscreenErrorView.g.setOnClickListener(new View.OnClickListener() { // from class: vng
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FullscreenErrorView fullscreenErrorView2 = FullscreenErrorView.this;
                View.OnClickListener onClickListener2 = onClickListener;
                fullscreenErrorView2.e.a(tgc.a(), fullscreenErrorView2.g);
                onClickListener2.onClick(view);
            }
        });
        this.i.f.f(this, new aox() { // from class: vnn
            @Override // defpackage.aox
            public final void a(Object obj) {
                EditActivity editActivity = EditActivity.this;
                voj vojVar = (voj) obj;
                int i6 = vojVar.c;
                int i7 = i6 - 1;
                if (i6 == 0) {
                    throw null;
                }
                if (i7 == 1) {
                    editActivity.a();
                    return;
                }
                if (i7 != 3) {
                    if (i7 != 4) {
                        return;
                    }
                    editActivity.g.c((aoff) vojVar.b.c());
                    editActivity.b();
                    return;
                }
                editActivity.g.c((aoff) vojVar.b.c());
                editActivity.setResult(-1, new Intent().setData((Uri) vojVar.a.c()));
                editActivity.g.a(aogv.OK);
                editActivity.finish();
            }
        });
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.photo_picker_edit_menu, menu);
        this.h.c(89740).a(Integer.valueOf(R.id.photo_picker_edit_info_menu_item));
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.photo_picker_edit_info_menu_item) {
            return false;
        }
        this.f.b(tgc.a(), this.h.b(Integer.valueOf(R.id.photo_picker_edit_info_menu_item)));
        dn k = getSupportFragmentManager().k();
        k.r(new vnt(), null);
        k.d();
        return true;
    }
}
