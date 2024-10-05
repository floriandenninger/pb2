package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.libraries.youtube.edit.ui.RoundedCornersEditText;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UserMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ida extends algb implements View.OnClickListener, hbf, icp {
    public static final /* synthetic */ int s = 0;
    private ImageView A;
    private View B;
    private View C;
    private LinearLayout D;
    private View E;
    private ImageView F;
    private SeekBar G;
    private CoordinatorLayout H;
    private boolean I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f220J;
    private boolean K;
    private axdj L;
    private acra N;
    private boolean O;
    private apxf P;
    private final vgz Q;
    private final ajyw R;
    public final Activity b;
    public final ce c;
    final idm d;
    final hbg e;
    public final acra g;
    public final akcy h;
    public final azrl i;
    public View j;
    public RoundedCornersEditText k;
    public TextView l;
    public boolean m;
    public idb n;
    public xzt o;
    public int p;
    public int q;
    public int r;
    private final zry u;
    private final icz v;
    private final idj w;
    private final aaea x;
    private View y;
    private View z;
    static final Typeface a = Typeface.create("sans-serif-black", 0);
    private static final axch t = axch.CLASSIC;
    final idd f = new idd();
    private axch M = t;

    public ida(ce ceVar, zry zryVar, idm idmVar, hbg hbgVar, icz iczVar, acra acraVar, aaea aaeaVar, idj idjVar, akcy akcyVar, vgz vgzVar, ajyw ajywVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.u = zryVar;
        this.d = idmVar;
        this.e = hbgVar;
        hbgVar.d = this;
        this.v = iczVar;
        this.c = ceVar;
        this.b = ceVar.C();
        this.g = acraVar;
        this.x = aaeaVar;
        this.w = idjVar;
        this.R = ajywVar;
        this.h = akcyVar;
        this.Q = vgzVar;
        this.i = azrl.e();
    }

    private final apxf m(int i) {
        apxf apxfVar = apxf.a;
        acra acraVar = this.N;
        if (acraVar == null || ((acqq) acraVar).g == null) {
            return apxfVar;
        }
        aone createBuilder = atmc.a.createBuilder();
        String str = ((acqq) this.N).g.a;
        createBuilder.copyOnWrite();
        atmc atmcVar = (atmc) createBuilder.instance;
        str.getClass();
        atmcVar.b |= 1;
        atmcVar.c = str;
        createBuilder.copyOnWrite();
        atmc atmcVar2 = (atmc) createBuilder.instance;
        atmcVar2.b |= 2;
        atmcVar2.d = i;
        atmc atmcVar3 = (atmc) createBuilder.build();
        aong aongVar = (aong) apxfVar.toBuilder();
        aongVar.e(atmb.b, atmcVar3);
        aongVar.copyOnWrite();
        apxf apxfVar2 = (apxf) aongVar.instance;
        apxfVar2.b &= -2;
        apxfVar2.c = apxf.a.c;
        return (apxf) aongVar.build();
    }

    private final void n(int i) {
        if (i == 5) {
            this.F.setImageDrawable(this.b.getDrawable(R.drawable.quantum_ic_format_align_left_white_24));
            this.E.setContentDescription(this.b.getString(R.string.text_alignment_left));
            this.k.setTextAlignment(5);
            this.D.setGravity(19);
            return;
        }
        if (i == 6) {
            this.F.setImageDrawable(this.b.getDrawable(R.drawable.quantum_ic_format_align_right_white_24));
            this.E.setContentDescription(this.b.getString(R.string.text_alignment_right));
            this.k.setTextAlignment(6);
            this.D.setGravity(21);
            return;
        }
        this.F.setImageDrawable(this.b.getDrawable(R.drawable.quantum_ic_format_align_center_white_24));
        this.E.setContentDescription(this.b.getString(R.string.text_alignment_center));
        this.k.setTextAlignment(4);
        this.D.setGravity(17);
    }

    private final void o(int i) {
        this.w.e.setVisibility(i);
        SeekBar seekBar = this.G;
        if (seekBar != null) {
            seekBar.setVisibility(i);
        }
    }

    private final void p(boolean z) {
        axdy axdyVar;
        int i;
        if (!z || !this.f220J) {
            axdj axdjVar = this.L;
            if (axdjVar == null) {
                return;
            }
            axdi i2 = ((axdk) axdjVar.instance).i();
            if (i2.c == 1) {
                axdyVar = (axdy) i2.d;
            } else {
                axdyVar = axdy.a;
            }
            axbl b = axbl.b(axdyVar.h);
            if (b == null) {
                b = axbl.ALIGN_HORIZONTAL_UNSPECIFIED;
            }
            if (b == axbl.ALIGN_LEFT) {
                i = 5;
            } else {
                i = b == axbl.ALIGN_RIGHT ? 6 : 4;
            }
            axch b2 = axch.b(axdyVar.i);
            if (b2 == null) {
                b2 = axch.FONT_FAMILY_UNSPECIFIED;
            }
            axch axchVar = b2;
            float f = axdyVar.j;
            String str = axdyVar.c;
            aoro aoroVar = axdyVar.e;
            if (aoroVar == null) {
                aoroVar = aoro.a;
            }
            int R = etx.R(aoroVar);
            aoro aoroVar2 = axdyVar.f;
            if (aoroVar2 == null) {
                aoroVar2 = aoro.a;
            }
            e(i, axchVar, f, str, R, etx.R(aoroVar2), axdyVar.l);
            return;
        }
        ynm.b(this.c, this.Q.a(), new ict(this, 0));
    }

    private final void q(boolean z) {
        this.j.animate().alpha(true != z ? 0.0f : 1.0f).setDuration(250L).setListener(new icx(this, z)).start();
    }

    private final void r(idn idnVar) {
        ImageView imageView = this.A;
        int i = idnVar.b;
        imageView.setBackgroundResource(i != 0 ? i != 1 ? R.drawable.ic_background_translucent : R.drawable.ic_background_on : R.drawable.ic_background_off);
        View view = this.z;
        Activity activity = this.b;
        int i2 = idnVar.b;
        view.setContentDescription(activity.getString(i2 != 0 ? i2 != 1 ? R.string.text_background_translucent : R.string.text_background_on : R.string.text_background_off));
    }

    private static final axdj s(axdk axdkVar) {
        if (axdkVar == null) {
            return axdk.j();
        }
        return (axdj) axdkVar.toBuilder();
    }

    @Override // defpackage.icp
    public final void a(axcg axcgVar) {
    }

    @Override // defpackage.algb
    public final void b(View view, int i) {
        iox ioxVar;
        axdx axdxVar;
        if (i == 5) {
            yny.B(this.D, -1, -1);
            o(0);
            if (!this.m || (axdxVar = (ioxVar = (iox) this.o).m) == null) {
                return;
            }
            ioxVar.d(axdxVar.d, axdxVar.c, axdxVar.e, axdxVar.f);
            ioxVar.m = null;
            return;
        }
        o(8);
        if (i == 2) {
            yny.z(this.D, yny.n(this.H.getHeight() / 2), ViewGroup.LayoutParams.class);
        }
    }

    public final aypy c() {
        return this.i.U();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x05c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 1542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ida.d():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r7, defpackage.axch r8, float r9, final java.lang.String r10, final int r11, int r12, final java.util.Collection r13) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ida.e(int, axch, float, java.lang.String, int, int, java.util.Collection):void");
    }

    public final void f() {
        this.k.setEnabled(false);
        idm idmVar = this.d;
        View view = idmVar.e;
        view.getClass();
        idmVar.c.getClass();
        idmVar.f.getClass();
        view.removeOnLayoutChangeListener(idmVar);
        idmVar.c.removeOnLayoutChangeListener(idmVar);
        InputMethodManager inputMethodManager = (InputMethodManager) this.b.getSystemService("input_method");
        this.e.a();
        inputMethodManager.hideSoftInputFromWindow(this.k.getWindowToken(), 2);
        q(false);
        this.g.t();
        this.v.aM(false);
    }

    public final void g(View view, View view2, View view3, boolean z, boolean z2, boolean z3, acra acraVar) {
        this.j = view;
        this.I = z;
        this.N = acraVar;
        this.O = acraVar != null;
        RoundedCornersEditText roundedCornersEditText = (RoundedCornersEditText) view.findViewById(R.id.add_text_input);
        this.k = roundedCornersEditText;
        if (roundedCornersEditText.a != z2) {
            roundedCornersEditText.a = z2;
            if (z2) {
                roundedCornersEditText.getLayoutParams().width = -1;
            } else {
                roundedCornersEditText.getLayoutParams().width = -2;
            }
            roundedCornersEditText.invalidate();
        }
        view.setOnClickListener(this);
        this.D = (LinearLayout) view.findViewById(R.id.text_input_container);
        this.m = z3;
        arfd a2 = this.x.a();
        if (a2 != null) {
            avxn avxnVar = a2.s;
            if (avxnVar == null) {
                avxnVar = avxn.a;
            }
            this.f220J = avxnVar.b;
            avxn avxnVar2 = a2.s;
            if (avxnVar2 == null) {
                avxnVar2 = avxn.a;
            }
            this.K = avxnVar2.c;
        }
        if (this.I) {
            View findViewById = view.findViewById(R.id.advanced_text_options_bar);
            this.z = view.findViewById(R.id.advanced_text_background_color_toggle);
            this.A = (ImageView) view.findViewById(R.id.advanced_text_background_color_toggle_image);
            this.E = view.findViewById(R.id.advanced_text_alignment_toggle);
            this.F = (ImageView) view.findViewById(R.id.advanced_text_alignment_toggle_image);
            n(4);
            this.l = (TextView) view.findViewById(R.id.advanced_text_font_toggle);
            findViewById.setVisibility(0);
            View findViewById2 = view.findViewById(R.id.advanced_text_done);
            this.C = findViewById2;
            findViewById2.setOnClickListener(this);
            this.E.setOnClickListener(this);
            this.l.setOnClickListener(this);
            SeekBar seekBar = (SeekBar) view.findViewById(R.id.seekBar);
            this.G = seekBar;
            seekBar.setVisibility(0);
            this.D.setPaddingRelative(0, 0, (int) this.b.getResources().getDimension(R.dimen.advanced_text_seekbar_padding), 0);
            this.G.setOnSeekBarChangeListener(new icw(this));
            this.f.put((idd) axch.CLASSIC, (axch) new idc(R.string.reel_advanced_text_font_classic, ammv.j(Float.valueOf(0.16666667f)), amlr.a));
            this.f.put((idd) axch.LIGHT, (axch) new idc(R.string.reel_advanced_text_font_light, ammv.j(Float.valueOf(0.1f)), ammv.j("name=Quicksand")));
            this.f.put((idd) axch.HEAVY, (axch) new idc(R.string.reel_advanced_text_font_heavy, amlr.a, ammv.j("name=Oswald&weight=700")));
            idd iddVar = this.f;
            axch axchVar = axch.MARKER;
            Float valueOf = Float.valueOf(0.25f);
            iddVar.put((idd) axchVar, (axch) new idc(R.string.reel_advanced_text_font_marker, ammv.j(valueOf), ammv.j("name=Permanent Marker")));
            this.f.put((idd) axch.BRUSH, (axch) new idc(R.string.reel_advanced_text_font_brush, ammv.j(valueOf), ammv.j("name=Pacifico")));
            this.f.put((idd) axch.TYPEWRITER, (axch) new idc(R.string.reel_advanced_text_font_typewriter, amlr.a, ammv.j("name=Cutive Mono")));
            this.f.b(axch.CLASSIC, a);
            idb idbVar = new idb(this.f, new icr(this), null, null);
            this.n = idbVar;
            idbVar.execute(this.b);
            j();
        } else {
            this.z = view.findViewById(R.id.text_background_color_toggle);
            this.A = (ImageView) view.findViewById(R.id.text_background_color_toggle_image);
            this.z.setVisibility(0);
        }
        idj idjVar = this.w;
        Activity activity = this.b;
        ViewGroup viewGroup = (ViewGroup) view;
        RoundedCornersEditText roundedCornersEditText2 = this.k;
        boolean z4 = this.K;
        icr icrVar = new icr(this);
        idjVar.c = activity;
        idjVar.f = roundedCornersEditText2;
        idjVar.h = z4;
        idjVar.i = icrVar;
        idjVar.e = (ViewGroup) viewGroup.findViewById(R.id.text_color_picker_holder);
        idjVar.b.a = z4;
        if (z4) {
            idjVar.d = (ViewGroup) viewGroup.findViewById(R.id.text_color_picker_paged);
            RecyclerView recyclerView = (RecyclerView) idjVar.d;
            recyclerView.s = true;
            recyclerView.af(new LinearLayoutManager(0));
            new idk().e(recyclerView);
            idf idfVar = idjVar.a;
            idfVar.f = idjVar;
            recyclerView.ac(idfVar);
        } else {
            idjVar.d = (ViewGroup) viewGroup.findViewById(R.id.text_color_picker);
            idjVar.d.setOnTouchListener(idjVar);
        }
        idjVar.d.setVisibility(0);
        this.y = idjVar.d;
        this.z.setOnClickListener(this);
        this.B = view3;
        view3.setOnClickListener(this);
        idm idmVar = this.d;
        RoundedCornersEditText roundedCornersEditText3 = this.k;
        LinearLayout linearLayout = this.D;
        View view4 = this.y;
        roundedCornersEditText3.getClass();
        idmVar.c = roundedCornersEditText3;
        linearLayout.getClass();
        idmVar.d = linearLayout;
        view.getClass();
        idmVar.e = view;
        view4.getClass();
        idmVar.f = view4;
        this.e.c(view2);
        if (z3) {
            this.H = (CoordinatorLayout) this.j.findViewById(R.id.reel_add_text_coordinator_layout);
            ViewGroup viewGroup2 = (ViewGroup) this.j.findViewById(R.id.user_mention_suggestions_bottom_sheet);
            viewGroup2.setBackgroundColor(0);
            viewGroup2.findViewById(R.id.user_mention_suggestions_top_bar).setBackgroundColor(wbs.Q(this.b, R.attr.ytStaticBrandWhite));
            aong aongVar = (aong) apxf.a.createBuilder();
            aongVar.e(UserMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint.userMentionSuggestionsEndpoint, UserMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint.a);
            apxf apxfVar = (apxf) aongVar.build();
            ajyw ajywVar = this.R;
            CoordinatorLayout coordinatorLayout = this.H;
            RoundedCornersEditText roundedCornersEditText4 = this.k;
            acra acraVar2 = this.g;
            avuu avuuVar = avuu.USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_TEXT_STICKER;
            Context context = (Context) ajywVar.a.get();
            context.getClass();
            jlb jlbVar = (jlb) ajywVar.c.get();
            jlbVar.getClass();
            coordinatorLayout.getClass();
            roundedCornersEditText4.getClass();
            viewGroup2.getClass();
            apxfVar.getClass();
            avuuVar.getClass();
            this.o = new iox(context, jlbVar, coordinatorLayout, roundedCornersEditText4, viewGroup2, apxfVar, acraVar2, avuuVar, this, (byte[]) null, (byte[]) null);
        }
    }

    public final void h(boolean z) {
        axdy axdyVar;
        axdj axdjVar = this.L;
        if (axdjVar == null) {
            return;
        }
        axdi i = ((axdk) axdjVar.instance).i();
        if (i.c == 1) {
            axdyVar = (axdy) i.d;
        } else {
            axdyVar = axdy.a;
        }
        aone builder = axdyVar.toBuilder();
        builder.copyOnWrite();
        axdy axdyVar2 = (axdy) builder.instance;
        axdyVar2.b |= 16384;
        axdyVar2.k = z;
        axdy axdyVar3 = (axdy) builder.build();
        aone builder2 = ((axdk) this.L.instance).i().toBuilder();
        builder2.copyOnWrite();
        axdi axdiVar = (axdi) builder2.instance;
        axdyVar3.getClass();
        axdiVar.d = axdyVar3;
        axdiVar.c = 1;
        axdi axdiVar2 = (axdi) builder2.build();
        axdj axdjVar2 = this.L;
        axdjVar2.copyOnWrite();
        ((axdk) axdjVar2.instance).F(axdiVar2);
        this.L = axdjVar2;
    }

    public final void i(apxf apxfVar) {
        this.L = s(null);
        if (apxfVar != null) {
            this.P = apxfVar;
        }
        p(true);
    }

    public final void j() {
        if (this.f.get(this.M) != null) {
            ammv ammvVar = ((idc) this.f.get(this.M)).b;
            if (ammvVar.h()) {
                RoundedCornersEditText roundedCornersEditText = this.k;
                roundedCornersEditText.a((int) (roundedCornersEditText.getTextSize() * ((Float) ammvVar.c()).floatValue()));
            } else {
                this.k.a(0);
            }
        }
    }

    @Override // defpackage.algb
    public final void mx(View view, float f) {
    }

    @Override // defpackage.icp
    public final void my(axdk axdkVar) {
        axdy axdyVar;
        axdj s2 = s(axdkVar);
        this.L = s2;
        axdi i = ((axdk) s2.instance).i();
        if (i.c == 1) {
            axdyVar = (axdy) i.d;
        } else {
            axdyVar = axdy.a;
        }
        boolean isEmpty = axdyVar.c.isEmpty();
        if (this.O) {
            if (isEmpty) {
                int i2 = this.r;
                this.P = i2 != 0 ? m(i2) : null;
            } else {
                int i3 = this.q;
                this.P = i3 != 0 ? m(i3) : null;
            }
        }
        p(isEmpty);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        axdy axdyVar;
        if (view != this.B) {
            if (view == this.j || view == this.C) {
                d();
                return;
            }
            if (view == this.z) {
                h(false);
                idj idjVar = this.w;
                idn idnVar = idjVar.b;
                int i = idnVar.b;
                if (i == 0) {
                    idnVar.b = 1;
                } else if (i != 1) {
                    idnVar.b = 0;
                } else {
                    idnVar.b = true == idnVar.a ? 2 : 0;
                }
                idjVar.b(idjVar.g);
                r(idjVar.b);
                return;
            }
            if (view == this.E) {
                h(false);
                Editable text = this.k.getText();
                if (this.k.getTextAlignment() == 4) {
                    n(5);
                } else if (this.k.getTextAlignment() == 5) {
                    n(6);
                } else {
                    n(4);
                }
                this.k.setText(text);
                this.k.setSelection(text.length());
                return;
            }
            if (view == this.l) {
                h(false);
                if (this.L == null) {
                    return;
                }
                axch axchVar = t;
                amru o = amru.o(this.f.keySet());
                int indexOf = o.indexOf(this.M);
                amkq.O(this.f.size() != 0, "Fonts not initialized");
                for (int size = (indexOf + 1) % o.size(); size != indexOf; size = (size + 1) % o.size()) {
                    axchVar = (axch) o.get(size);
                    if (this.f.a(axchVar) != null) {
                        break;
                    }
                }
                if (this.f.get(axchVar) == null) {
                    zga.c("AddTextController", "fontMap.get(newFont) is null. Using default font.");
                    axchVar = t;
                }
                this.k.setTypeface(this.f.a(axchVar));
                this.l.setText(((idc) this.f.get(axchVar)).a);
                axdi i2 = ((axdk) this.L.instance).i();
                if (i2.c == 1) {
                    axdyVar = (axdy) i2.d;
                } else {
                    axdyVar = axdy.a;
                }
                aone builder = axdyVar.toBuilder();
                builder.copyOnWrite();
                axdy axdyVar2 = (axdy) builder.instance;
                axdyVar2.i = axchVar.h;
                axdyVar2.b |= 512;
                axdy axdyVar3 = (axdy) builder.build();
                axdj axdjVar = this.L;
                aone builder2 = ((axdk) axdjVar.instance).i().toBuilder();
                builder2.copyOnWrite();
                axdi axdiVar = (axdi) builder2.instance;
                axdyVar3.getClass();
                axdiVar.d = axdyVar3;
                axdiVar.c = 1;
                axdjVar.copyOnWrite();
                ((axdk) axdjVar.instance).F((axdi) builder2.build());
                this.M = axchVar;
                j();
                return;
            }
            return;
        }
        if (!this.O) {
            this.g.I(3, new acqx(acsb.c(37172)), null);
        } else {
            int i3 = this.p;
            this.P = i3 != 0 ? m(i3) : null;
        }
        i(null);
    }
}
