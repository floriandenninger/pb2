package com.google.android.libraries.youtube.metadataeditor.geo;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AddPlaceEndpointOuterClass$AddPlaceEndpoint;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.MobilePlaceResultRendererOuterClass;
import defpackage.aapi;
import defpackage.acqx;
import defpackage.acra;
import defpackage.afoe;
import defpackage.afog;
import defpackage.afou;
import defpackage.ajcq;
import defpackage.ajyf;
import defpackage.ajyg;
import defpackage.amkq;
import defpackage.aots;
import defpackage.apmg;
import defpackage.apxf;
import defpackage.aqyg;
import defpackage.astu;
import defpackage.atft;
import defpackage.aulq;
import defpackage.zga;
import java.util.IdentityHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class EditLocation extends afog implements View.OnClickListener {
    public afoe a;
    public acra b;
    public ajyg c;
    public Place d;
    private final Drawable e;
    private final Drawable f;
    private final ViewGroup g;
    private final TextView h;
    private final ImageButton i;
    private final TextView j;
    private final TextView k;
    private final IdentityHashMap l;
    private astu m;
    private boolean n;
    private apmg o;
    private apmg p;
    private Place q;

    public EditLocation(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = new IdentityHashMap();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, afou.a, 0, 0);
        try {
            this.e = obtainStyledAttributes.getDrawable(10);
            this.f = obtainStyledAttributes.getDrawable(12);
            obtainStyledAttributes.recycle();
            setOrientation(1);
            inflate(context, R.layout.metadataeditor_location_view, this);
            TextView textView = (TextView) findViewById(R.id.location_setting_text);
            this.h = textView;
            textView.setOnClickListener(this);
            this.g = (ViewGroup) findViewById(R.id.place_suggestions);
            ImageButton imageButton = (ImageButton) findViewById(R.id.location_action_icon);
            this.i = imageButton;
            imageButton.setOnClickListener(this);
            this.j = (TextView) findViewById(R.id.location_search_notice);
            this.k = (TextView) findViewById(R.id.learn_more_button);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void h(apmg apmgVar, Drawable drawable) {
        if (apmgVar == null) {
            return;
        }
        this.i.setImageDrawable(drawable);
        if ((apmgVar.b & 65536) != 0) {
            ImageButton imageButton = this.i;
            aots aotsVar = apmgVar.r;
            if (aotsVar == null) {
                aotsVar = aots.a;
            }
            imageButton.setContentDescription(aotsVar.c);
        }
        Boolean bool = (Boolean) this.l.get(apmgVar);
        if (bool == null || !bool.booleanValue()) {
            this.b.u(new acqx(apmgVar.t), null);
            this.l.put(apmgVar, true);
        }
    }

    public final void a(astu astuVar) {
        this.m = astuVar;
        if ((astuVar.b & 8) != 0) {
            aulq aulqVar = this.m.e;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            this.p = (apmg) aulqVar.pX(ButtonRendererOuterClass.buttonRenderer);
        }
        if ((astuVar.b & 16) != 0) {
            aulq aulqVar2 = this.m.f;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            this.o = (apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer);
        }
        this.g.removeAllViews();
        aqyg aqygVar = null;
        if (astuVar.g.size() > 0) {
            this.g.setVisibility(0);
            LayoutInflater from = LayoutInflater.from(getContext());
            for (aulq aulqVar3 : astuVar.g) {
                if (aulqVar3.pY(MobilePlaceResultRendererOuterClass.mobilePlaceResultRenderer)) {
                    atft atftVar = (atft) aulqVar3.pX(MobilePlaceResultRendererOuterClass.mobilePlaceResultRenderer);
                    if ((atftVar.b & 2) == 0) {
                        String valueOf = String.valueOf(atftVar.c);
                        zga.b(valueOf.length() != 0 ? "Empty place received: ".concat(valueOf) : new String("Empty place received: "));
                    } else {
                        Button button = (Button) from.inflate(R.layout.metadataeditor_location_suggestion, (ViewGroup) null);
                        this.g.addView(button);
                        aqyg aqygVar2 = atftVar.d;
                        if (aqygVar2 == null) {
                            aqygVar2 = aqyg.a;
                        }
                        button.setText(ajcq.b(aqygVar2));
                        apxf apxfVar = atftVar.f;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                        button.setTag(apxfVar);
                        button.setOnClickListener(this);
                    }
                }
            }
        }
        if ((astuVar.b & 32) != 0 && (aqygVar = astuVar.h) == null) {
            aqygVar = aqyg.a;
        }
        Spanned b = ajcq.b(aqygVar);
        if (!TextUtils.isEmpty(b)) {
            this.j.setText(b);
            this.j.setVisibility(0);
        }
        if ((astuVar.b & 64) != 0) {
            ajyf a = this.c.a(this.k);
            aulq aulqVar4 = astuVar.i;
            if (aulqVar4 == null) {
                aulqVar4 = aulq.a;
            }
            a.b((apmg) aulqVar4.pX(ButtonRendererOuterClass.buttonRenderer), this.b);
        }
        boolean z = !amkq.b(this.d, this.q);
        if ((astuVar.b & 4) != 0) {
            aulq aulqVar5 = this.m.d;
            if (aulqVar5 == null) {
                aulqVar5 = aulq.a;
            }
            atft atftVar2 = (atft) aulqVar5.pX(MobilePlaceResultRendererOuterClass.mobilePlaceResultRenderer);
            if (atftVar2 != null && (atftVar2.b & 2) != 0) {
                String str = atftVar2.c;
                aqyg aqygVar3 = atftVar2.d;
                if (aqygVar3 == null) {
                    aqygVar3 = aqyg.a;
                }
                this.q = new Place(str, ajcq.b(aqygVar3).toString());
            }
        }
        if (z) {
            c(this.d);
        } else {
            c(this.q);
        }
    }

    public final void b() {
        aqyg aqygVar = null;
        this.d = null;
        astu astuVar = this.m;
        int i = astuVar.b & 2;
        if (i != 0) {
            TextView textView = this.h;
            if (i != 0 && (aqygVar = astuVar.c) == null) {
                aqygVar = aqyg.a;
            }
            textView.setText(ajcq.b(aqygVar));
        }
        h(this.o, this.e);
        this.n = false;
        this.g.setVisibility(0);
    }

    public final void c(Place place) {
        if (place == null) {
            b();
            return;
        }
        this.d = place;
        this.h.setText(place.b);
        h(this.p, this.f);
        this.n = true;
        this.g.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.i) {
            if (this.n) {
                b();
                return;
            } else {
                this.a.r();
                return;
            }
        }
        if (view == this.h) {
            this.a.r();
            return;
        }
        Object tag = view.getTag();
        if (tag instanceof apxf) {
            apxf apxfVar = (apxf) tag;
            aqyg aqygVar = null;
            if ((apxfVar.b & 1) != 0) {
                this.b.I(3, new acqx(apxfVar.c), null);
            }
            if (!apxfVar.pY(AddPlaceEndpointOuterClass$AddPlaceEndpoint.addPlaceEndpoint)) {
                zga.b("AddPlaceEndpoint not returned for place suggestion.");
                return;
            }
            AddPlaceEndpointOuterClass$AddPlaceEndpoint addPlaceEndpointOuterClass$AddPlaceEndpoint = (AddPlaceEndpointOuterClass$AddPlaceEndpoint) apxfVar.pX(AddPlaceEndpointOuterClass$AddPlaceEndpoint.addPlaceEndpoint);
            String str = addPlaceEndpointOuterClass$AddPlaceEndpoint.c;
            if ((addPlaceEndpointOuterClass$AddPlaceEndpoint.b & 2) != 0 && (aqygVar = addPlaceEndpointOuterClass$AddPlaceEndpoint.d) == null) {
                aqygVar = aqyg.a;
            }
            c(new Place(str, ajcq.b(aqygVar).toString()));
        }
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        astu astuVar = savedState.b;
        if (astuVar != null) {
            a(astuVar);
            c(savedState.a);
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.d;
        savedState.b = this.m;
        return savedState;
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new aapi(13);
        Place a;
        astu b;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = (Place) parcel.readParcelable(EditLocation.class.getClassLoader());
            this.b = (astu) ((ParcelableMessageLite) parcel.readParcelable(ParcelableMessageLite.class.getClassLoader())).a(astu.a);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.a, 0);
            parcel.writeParcelable(new ParcelableMessageLite(this.b), 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
