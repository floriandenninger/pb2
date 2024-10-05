package defpackage;

import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nhf {
    public final View a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final ImageView f;
    public final ImageView g;
    public final TextView h;
    public final View i;
    final /* synthetic */ nhg j;
    private fyl k;
    private final TypedValue l;
    private final boolean m;

    public nhf(nhg nhgVar, int i) {
        this.j = nhgVar;
        View inflate = View.inflate(nhgVar.a, i, null);
        this.a = inflate;
        this.b = (TextView) inflate.findViewById(R.id.title);
        this.d = (TextView) inflate.findViewById(R.id.channel_name);
        this.c = (TextView) inflate.findViewById(R.id.duration);
        this.f = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.i = inflate.findViewById(R.id.contextual_menu_anchor);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.channel_thumbnail);
        this.g = imageView;
        this.e = (TextView) inflate.findViewById(R.id.description);
        TextView textView = (TextView) inflate.findViewById(R.id.call_to_action);
        this.h = textView;
        TypedValue typedValue = new TypedValue();
        this.l = typedValue;
        final int i2 = 1;
        boolean resolveAttribute = nhgVar.a.getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        this.m = resolveAttribute;
        Drawable a = resolveAttribute ? aii.a(nhgVar.a, typedValue.resourceId) : null;
        final int i3 = 0;
        fyl fylVar = new fyl(a, wbs.W(nhgVar.a, R.attr.adSeparator1).orElse(0), nhgVar.b.getDimensionPixelSize(R.dimen.line_separator_height));
        this.k = fylVar;
        whu.r(inflate, fylVar);
        inflate.setOnClickListener(new View.OnClickListener(this) { // from class: nhe
            public final /* synthetic */ nhf a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                auib auibVar;
                auib auibVar2;
                int i4 = i2;
                if (i4 == 0) {
                    nhg nhgVar2 = this.a.j;
                    auia auiaVar = nhgVar2.g;
                    if (auiaVar == null || (auiaVar.b & 2048) == 0) {
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", nhgVar2.g);
                    aahd aahdVar = nhgVar2.e;
                    apxf apxfVar = nhgVar2.g.k;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.c(apxfVar, hashMap);
                    return;
                }
                if (i4 != 1) {
                    nhg nhgVar3 = this.a.j;
                    auia auiaVar2 = nhgVar3.g;
                    if (auiaVar2 == null || (auiaVar2.b & 1024) == 0) {
                        return;
                    }
                    auhy auhyVar = auiaVar2.j;
                    if (auhyVar == null) {
                        auhyVar = auhy.a;
                    }
                    if (auhyVar.b == 62897987) {
                        auibVar = (auib) auhyVar.c;
                    } else {
                        auibVar = auib.a;
                    }
                    if ((auibVar.b & 4) != 0) {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("com.google.android.libraries.youtube.innertube.endpoint.tag", nhgVar3.g);
                        aahd aahdVar2 = nhgVar3.e;
                        auhy auhyVar2 = nhgVar3.g.j;
                        if (auhyVar2 == null) {
                            auhyVar2 = auhy.a;
                        }
                        if (auhyVar2.b == 62897987) {
                            auibVar2 = (auib) auhyVar2.c;
                        } else {
                            auibVar2 = auib.a;
                        }
                        apxf apxfVar2 = auibVar2.d;
                        if (apxfVar2 == null) {
                            apxfVar2 = apxf.a;
                        }
                        aahdVar2.c(apxfVar2, hashMap2);
                        return;
                    }
                    return;
                }
                nhf nhfVar = this.a;
                nhg nhgVar4 = nhfVar.j;
                ImageView imageView2 = nhfVar.f;
                auia auiaVar3 = nhgVar4.g;
                if (auiaVar3 == null || (auiaVar3.b & 512) == 0) {
                    return;
                }
                amru a2 = nbp.a(auiaVar3.m);
                HashMap hashMap3 = new HashMap();
                hashMap3.put("com.google.android.libraries.youtube.innertube.endpoint.tag", nhgVar4.g);
                nhgVar4.e.d(a2, hashMap3);
                aahd aahdVar3 = nhgVar4.e;
                apxf apxfVar3 = nhgVar4.g.i;
                if (apxfVar3 == null) {
                    apxfVar3 = apxf.a;
                }
                auia auiaVar4 = nhgVar4.g;
                if (auiaVar4 != null && (auiaVar4.b & 2) != 0) {
                    HashMap hashMap4 = new HashMap(hashMap3);
                    avgg avggVar = nhgVar4.g.c;
                    if (avggVar == null) {
                        avggVar = avgg.a;
                    }
                    hashMap4.put("VideoPresenterConstants.VIDEO_THUMBNAIL_DETAILS_KEY", avggVar);
                    if (imageView2 != null) {
                        hashMap4.put("VideoPresenterConstants.VIDEO_THUMBNAIL_VIEW_KEY", imageView2);
                    }
                    hashMap3 = hashMap4;
                }
                aahdVar3.c(apxfVar3, hashMap3);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: nhe
            public final /* synthetic */ nhf a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                auib auibVar;
                auib auibVar2;
                int i4 = i3;
                if (i4 == 0) {
                    nhg nhgVar2 = this.a.j;
                    auia auiaVar = nhgVar2.g;
                    if (auiaVar == null || (auiaVar.b & 2048) == 0) {
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", nhgVar2.g);
                    aahd aahdVar = nhgVar2.e;
                    apxf apxfVar = nhgVar2.g.k;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.c(apxfVar, hashMap);
                    return;
                }
                if (i4 != 1) {
                    nhg nhgVar3 = this.a.j;
                    auia auiaVar2 = nhgVar3.g;
                    if (auiaVar2 == null || (auiaVar2.b & 1024) == 0) {
                        return;
                    }
                    auhy auhyVar = auiaVar2.j;
                    if (auhyVar == null) {
                        auhyVar = auhy.a;
                    }
                    if (auhyVar.b == 62897987) {
                        auibVar = (auib) auhyVar.c;
                    } else {
                        auibVar = auib.a;
                    }
                    if ((auibVar.b & 4) != 0) {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("com.google.android.libraries.youtube.innertube.endpoint.tag", nhgVar3.g);
                        aahd aahdVar2 = nhgVar3.e;
                        auhy auhyVar2 = nhgVar3.g.j;
                        if (auhyVar2 == null) {
                            auhyVar2 = auhy.a;
                        }
                        if (auhyVar2.b == 62897987) {
                            auibVar2 = (auib) auhyVar2.c;
                        } else {
                            auibVar2 = auib.a;
                        }
                        apxf apxfVar2 = auibVar2.d;
                        if (apxfVar2 == null) {
                            apxfVar2 = apxf.a;
                        }
                        aahdVar2.c(apxfVar2, hashMap2);
                        return;
                    }
                    return;
                }
                nhf nhfVar = this.a;
                nhg nhgVar4 = nhfVar.j;
                ImageView imageView2 = nhfVar.f;
                auia auiaVar3 = nhgVar4.g;
                if (auiaVar3 == null || (auiaVar3.b & 512) == 0) {
                    return;
                }
                amru a2 = nbp.a(auiaVar3.m);
                HashMap hashMap3 = new HashMap();
                hashMap3.put("com.google.android.libraries.youtube.innertube.endpoint.tag", nhgVar4.g);
                nhgVar4.e.d(a2, hashMap3);
                aahd aahdVar3 = nhgVar4.e;
                apxf apxfVar3 = nhgVar4.g.i;
                if (apxfVar3 == null) {
                    apxfVar3 = apxf.a;
                }
                auia auiaVar4 = nhgVar4.g;
                if (auiaVar4 != null && (auiaVar4.b & 2) != 0) {
                    HashMap hashMap4 = new HashMap(hashMap3);
                    avgg avggVar = nhgVar4.g.c;
                    if (avggVar == null) {
                        avggVar = avgg.a;
                    }
                    hashMap4.put("VideoPresenterConstants.VIDEO_THUMBNAIL_DETAILS_KEY", avggVar);
                    if (imageView2 != null) {
                        hashMap4.put("VideoPresenterConstants.VIDEO_THUMBNAIL_VIEW_KEY", imageView2);
                    }
                    hashMap3 = hashMap4;
                }
                aahdVar3.c(apxfVar3, hashMap3);
            }
        });
        final int i4 = 2;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: nhe
            public final /* synthetic */ nhf a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                auib auibVar;
                auib auibVar2;
                int i42 = i4;
                if (i42 == 0) {
                    nhg nhgVar2 = this.a.j;
                    auia auiaVar = nhgVar2.g;
                    if (auiaVar == null || (auiaVar.b & 2048) == 0) {
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", nhgVar2.g);
                    aahd aahdVar = nhgVar2.e;
                    apxf apxfVar = nhgVar2.g.k;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.c(apxfVar, hashMap);
                    return;
                }
                if (i42 != 1) {
                    nhg nhgVar3 = this.a.j;
                    auia auiaVar2 = nhgVar3.g;
                    if (auiaVar2 == null || (auiaVar2.b & 1024) == 0) {
                        return;
                    }
                    auhy auhyVar = auiaVar2.j;
                    if (auhyVar == null) {
                        auhyVar = auhy.a;
                    }
                    if (auhyVar.b == 62897987) {
                        auibVar = (auib) auhyVar.c;
                    } else {
                        auibVar = auib.a;
                    }
                    if ((auibVar.b & 4) != 0) {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("com.google.android.libraries.youtube.innertube.endpoint.tag", nhgVar3.g);
                        aahd aahdVar2 = nhgVar3.e;
                        auhy auhyVar2 = nhgVar3.g.j;
                        if (auhyVar2 == null) {
                            auhyVar2 = auhy.a;
                        }
                        if (auhyVar2.b == 62897987) {
                            auibVar2 = (auib) auhyVar2.c;
                        } else {
                            auibVar2 = auib.a;
                        }
                        apxf apxfVar2 = auibVar2.d;
                        if (apxfVar2 == null) {
                            apxfVar2 = apxf.a;
                        }
                        aahdVar2.c(apxfVar2, hashMap2);
                        return;
                    }
                    return;
                }
                nhf nhfVar = this.a;
                nhg nhgVar4 = nhfVar.j;
                ImageView imageView2 = nhfVar.f;
                auia auiaVar3 = nhgVar4.g;
                if (auiaVar3 == null || (auiaVar3.b & 512) == 0) {
                    return;
                }
                amru a2 = nbp.a(auiaVar3.m);
                HashMap hashMap3 = new HashMap();
                hashMap3.put("com.google.android.libraries.youtube.innertube.endpoint.tag", nhgVar4.g);
                nhgVar4.e.d(a2, hashMap3);
                aahd aahdVar3 = nhgVar4.e;
                apxf apxfVar3 = nhgVar4.g.i;
                if (apxfVar3 == null) {
                    apxfVar3 = apxf.a;
                }
                auia auiaVar4 = nhgVar4.g;
                if (auiaVar4 != null && (auiaVar4.b & 2) != 0) {
                    HashMap hashMap4 = new HashMap(hashMap3);
                    avgg avggVar = nhgVar4.g.c;
                    if (avggVar == null) {
                        avggVar = avgg.a;
                    }
                    hashMap4.put("VideoPresenterConstants.VIDEO_THUMBNAIL_DETAILS_KEY", avggVar);
                    if (imageView2 != null) {
                        hashMap4.put("VideoPresenterConstants.VIDEO_THUMBNAIL_VIEW_KEY", imageView2);
                    }
                    hashMap3 = hashMap4;
                }
                aahdVar3.c(apxfVar3, hashMap3);
            }
        });
    }

    public final fyl a(int i) {
        fyl fylVar = new fyl(this.m ? aii.a(this.j.a, this.l.resourceId) : null, wbs.W(this.j.a, R.attr.adSeparator1).orElse(0), i);
        this.k = fylVar;
        whu.r(this.a, fylVar);
        return this.k;
    }
}
