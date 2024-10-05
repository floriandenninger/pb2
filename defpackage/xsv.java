package defpackage;

import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.google.android.libraries.youtube.comment.image.ImageGridRecyclerView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint;
import com.google.protos.youtube.api.innertube.PostImagePickerRendererOuterClass;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xsv extends xrx {
    public static final String[] a = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
    public static final /* synthetic */ int ag = 0;
    public MenuItem ae;
    public Toolbar af;
    private BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint ah;
    private ImageGridRecyclerView ai;
    private ViewStub aj;
    private View ak;
    public xud b;
    public auei c;
    public xtk d;
    public xsu e;

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        this.ah = null;
        try {
            this.ah = (BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint) amkq.cj(this.m, "image_upload_endpoint", BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.a, aomw.b());
        } catch (aoob e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.ce
    public final void mS() {
        super.mS();
        Cursor query = C().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_size", "width", "height", "orientation"}, null, null, "date_modified DESC");
        xtk xtkVar = this.d;
        xtkVar.k.b = query;
        xtkVar.f.a();
        if (query.getCount() != 0) {
            View view = this.ak;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        if (ar()) {
            if (this.ak == null) {
                this.ak = this.aj.inflate();
                Resources resources = C().getResources();
                this.ak.setBackgroundDrawable(new xuf(resources.getDimensionPixelSize(R.dimen.image_gallery_thumbnail_min_width), resources.getDimensionPixelSize(R.dimen.image_gallery_thumbnail_margin), aih.d(C(), R.color.image_gallery_zero_state_grid_divider_color)));
            }
            this.ak.setVisibility(0);
        }
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.image_picker_fragment, viewGroup, false);
        aulq aulqVar = this.ah.j;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(PostImagePickerRendererOuterClass.postImagePickerRenderer)) {
            aulq aulqVar2 = this.ah.j;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            this.c = (auei) aulqVar2.pX(PostImagePickerRendererOuterClass.postImagePickerRenderer);
        }
        if (this.c != null) {
            Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
            this.af = toolbar;
            whu.I(toolbar, true);
            zau zauVar = new zau(qR());
            Toolbar toolbar2 = this.af;
            toolbar2.q(zauVar.b(toolbar2.e(), wbs.W(qR(), R.attr.ytIconActiveOther).orElse(0)));
            Toolbar toolbar3 = this.af;
            aqyg aqygVar = this.c.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            toolbar3.x(ajcq.b(aqygVar));
            this.af.l(R.menu.image_gallery_action_menu);
            MenuItem findItem = this.af.g().findItem(R.id.next_button);
            this.ae = findItem;
            aqyg aqygVar2 = this.c.d;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            findItem.setTitle(ajcq.b(aqygVar2));
            this.ae.setEnabled(true ^ this.b.b().isEmpty());
            this.af.o(R.string.accessibility_close_dialog);
            this.af.q = new yq() { // from class: xsq
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.yq
                public final boolean a(MenuItem menuItem) {
                    int i;
                    String str;
                    Drawable drawable;
                    argf argfVar;
                    xsv xsvVar = xsv.this;
                    List<xrt> list = xsvVar.d.i;
                    amrp f = amru.f();
                    for (xrt xrtVar : list) {
                        xug a2 = xuh.a();
                        a2.d(xrtVar.a);
                        a2.b(xrtVar.f);
                        f.h(a2.a());
                    }
                    final xud xudVar = xsvVar.b;
                    amru g = f.g();
                    yjk.f();
                    HashSet hashSet = new HashSet();
                    ArrayList<xuh> arrayList = new ArrayList();
                    amxe it = g.iterator();
                    while (it.hasNext()) {
                        xuh xuhVar = (xuh) it.next();
                        if (!hashSet.add(xuhVar.a)) {
                            String valueOf = String.valueOf(xuhVar.a);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
                            sb.append(valueOf);
                            sb.append(" already exists");
                            zga.b(sb.toString());
                        } else {
                            arrayList.add(xuhVar);
                        }
                    }
                    ArrayList<xuh> arrayList2 = new ArrayList();
                    for (xuh xuhVar2 : arrayList) {
                        if (xudVar.g.containsKey(xuhVar2.a)) {
                            xuh xuhVar3 = (xuh) xudVar.g.get(xuhVar2.a);
                            xug b = xuhVar2.b();
                            if (xuhVar2.d == null && (argfVar = xuhVar3.d) != null) {
                                b.b = argfVar;
                            }
                            if (xuhVar2.c == null && (drawable = xuhVar3.c) != null) {
                                b.a = drawable;
                            }
                            if (xuhVar2.f == null && (str = xuhVar3.f) != null) {
                                b.c = str;
                            }
                            if (xuhVar2.e == 0 && (i = xuhVar3.e) != 0) {
                                b.c(i);
                            }
                            xuhVar2 = b.a();
                        }
                        arrayList2.add(xuhVar2);
                    }
                    Iterator it2 = xudVar.f.iterator();
                    while (it2.hasNext()) {
                        xudVar.f((Uri) it2.next());
                    }
                    xudVar.f.clear();
                    final amrp f2 = amru.f();
                    for (xuh xuhVar4 : arrayList2) {
                        final Uri uri = xuhVar4.a;
                        if (xuhVar4.c == null) {
                            xudVar.h.execute(new Runnable() { // from class: xts
                                @Override // java.lang.Runnable
                                public final void run() {
                                    final xud xudVar2 = xud.this;
                                    final Uri uri2 = uri;
                                    xudVar2.e.a(uri2, new xso() { // from class: xto
                                        @Override // defpackage.xso
                                        public final void a(final Drawable drawable2) {
                                            final xud xudVar3 = xud.this;
                                            final Uri uri3 = uri2;
                                            xudVar3.i.execute(new Runnable() { // from class: xtt
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    xud xudVar4 = xud.this;
                                                    Uri uri4 = uri3;
                                                    Drawable drawable3 = drawable2;
                                                    if (xudVar4.f.contains(uri4)) {
                                                        xuh xuhVar5 = (xuh) xudVar4.g.get(uri4);
                                                        xug b2 = xuhVar5.b();
                                                        b2.a = wcy.o(xudVar4.d, drawable3, xuhVar5.b);
                                                        if (xuhVar5.d == null) {
                                                            b2.b = wcy.p(r2.getIntrinsicWidth(), r2.getIntrinsicHeight());
                                                        }
                                                        xudVar4.g(b2.a());
                                                    }
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                        if (xuhVar4.c != null && xuhVar4.d == null) {
                            xug b2 = xuhVar4.b();
                            b2.b = wcy.p(xuhVar4.c.getIntrinsicWidth(), xuhVar4.c.getIntrinsicWidth());
                            xuhVar4 = b2.a();
                        }
                        f2.h(xuhVar4);
                        xudVar.f.add(xuhVar4.a);
                        xudVar.g.put(xuhVar4.a, xuhVar4);
                    }
                    xudVar.i.execute(new Runnable() { // from class: xtv
                        @Override // java.lang.Runnable
                        public final void run() {
                            xud.this.a.c(xub.b(f2.g()));
                        }
                    });
                    xsvVar.C().onBackPressed();
                    return true;
                }
            };
            this.af.r(new View.OnClickListener() { // from class: xsr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xsv.this.C().onBackPressed();
                }
            });
            this.e = new xsu() { // from class: xss
                @Override // defpackage.xsu
                public final void c(xrt xrtVar, int i) {
                    xsv xsvVar = xsv.this;
                    Toolbar toolbar4 = xsvVar.af;
                    if (toolbar4 != null) {
                        if (i == 0) {
                            aqyg aqygVar3 = xsvVar.c.c;
                            if (aqygVar3 == null) {
                                aqygVar3 = aqyg.a;
                            }
                            toolbar4.x(ajcq.b(aqygVar3));
                        } else {
                            toolbar4.x(xsvVar.qR().getResources().getQuantityString(R.plurals.image_picker_title, i, Integer.valueOf(i)));
                        }
                    }
                    MenuItem menuItem = xsvVar.ae;
                    if (menuItem != null) {
                        menuItem.setEnabled(i > 0);
                    }
                }
            };
        } else {
            ImageView imageView = (ImageView) inflate.findViewById(R.id.gallery_dismiss_button);
            whu.I(imageView, true);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: xsr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xsv.this.C().onBackPressed();
                }
            });
        }
        this.ai = (ImageGridRecyclerView) inflate.findViewById(R.id.image_grid_recycler_view);
        this.aj = (ViewStub) inflate.findViewById(R.id.zero_state_stub);
        xtk xtkVar = new xtk(C(), this.ai.W, new xst(this), this.ah, this.b.b());
        this.d = xtkVar;
        this.ai.ac(xtkVar);
        this.ai.aD(this.d.l);
        return inflate;
    }
}
