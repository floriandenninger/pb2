package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.SwitchCompat;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.libraries.youtube.edit.ui.ViewAnimatorHelper;
import com.google.android.libraries.youtube.livecreation.innertube.StreamMetadata;
import com.google.android.libraries.youtube.livecreation.ui.view.EditTextTitle;
import com.google.android.libraries.youtube.livecreation.ui.view.LiveCreationSettingView;
import com.google.android.libraries.youtube.livecreation.ui.view.NetworkOperationView;
import com.google.android.libraries.youtube.metadataeditor.geo.EditLocation;
import com.google.android.libraries.youtube.metadataeditor.geo.Place;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint;
import com.google.protos.youtube.api.innertube.MobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint;
import com.google.protos.youtube.api.innertube.ShowTooltipCommandOuterClass;
import com.google.protos.youtube.api.innertube.TooltipRendererOuterClass;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acjl extends achk implements View.OnClickListener, TextWatcher, AdapterView.OnItemSelectedListener, CompoundButton.OnCheckedChangeListener, acju, abxz, abve, acfn, abxw, abxu, acjw, afoe {
    public abya aA;
    public acjk aB;
    public afot aC;
    public acfo aD;
    public shf aE;
    public akch aF;
    public acfm aG;
    public SharedPreferences aH;
    public ajyg aI;
    public abxp aJ;
    public acra aK;
    public agcm aL;
    public advq aM;
    public advq aN;
    public ajyw aO;
    public axze aP;
    private View aU;
    private ImageButton aV;
    private byte[] aW;
    private ImageButton aX;
    private byte[] aY;
    private TextView aZ;
    public acjv ae;
    public acjx af;
    public EditTextTitle ag;
    public EditText ah;
    public EditLocation ai;
    public EditLocation aj;
    public Button ak;
    public NetworkOperationView al;
    public String am;
    public boolean an;
    public Boolean ao;
    public Boolean ap;
    public arnn aq;
    public atfn ar;
    public acgz as;
    public aqzu at;
    public Handler au;
    public aahd av;
    public ajjz aw;
    public wdm ax;
    public ajec ay;
    public acfh az;
    private boolean bA;
    private String bB;
    private String bC;
    private Date bD;
    private boolean bE;
    private CharSequence bF;
    private Place bG;
    private Boolean bH;
    private Boolean bI;
    private Boolean bJ;
    private arno bK;
    private int bL;
    private boolean bM;
    private apxf bO;
    private apxf bP;
    private int bQ;
    private int bR;
    private FrameLayout ba;
    private ImageButton bb;
    private ImageButton bc;
    private ImageButton bd;
    private ViewGroup be;
    private ImageView bf;
    private apxf bg;
    private TextInputLayout bh;
    private Spinner bi;
    private ViewGroup bj;
    private ViewGroup bk;
    private TextView bl;
    private TextView bm;
    private View bn;
    private TextView bo;
    private SwitchCompat bp;
    private View bq;
    private TextView br;
    private View bs;
    private TextView bt;
    private acjy bu;
    private acho bv;
    private acka bw;
    private LiveCreationSettingView bx;
    private boolean by;
    private boolean bz;
    public ViewAnimatorHelper c;
    public afol e;
    public static final long a = TimeUnit.MINUTES.toMillis(30);
    public static final Date b = new Date(0);
    private static final PermissionDescriptor aT = new PermissionDescriptor(3, acrb.MOBILE_LIVE_APPROVE_LOCATION_BUTTON, acrb.MOBILE_LIVE_DENY_LOCATION_BUTTON);
    public int d = -1;
    private boolean bN = true;

    public static final boolean aO(CharSequence charSequence) {
        return charSequence.length() > 0 && charSequence.length() <= 60;
    }

    private final void aR(byte[] bArr) {
        if (bArr != null) {
            this.aK.D(new acqx(bArr));
        }
    }

    private final void aS() {
        this.aB.y(false);
        this.bd.setVisibility(this.bL > 1 ? 0 : 8);
        abvt.b().h = false;
        if (ba()) {
            this.bJ = false;
            this.bb.setSelected(false);
            if (this.bL > 1) {
                this.bc.setVisibility(8);
            } else {
                this.bc.setSelected(true);
            }
        }
        this.bx.setVisibility(8);
        aY(this.ai, this.aj);
    }

    private final void aT() {
        this.aB.y(true);
        this.bJ = true;
        abvt.b().h = true;
        this.bb.setSelected(true);
        this.bc.setSelected(false);
        this.bd.setVisibility(8);
        this.bc.setVisibility(0);
        this.bx.setVisibility(0);
        aY(this.aj, this.ai);
    }

    private final void aU(View view, boolean z) {
        View findViewById = view.findViewById(R.id.pre_stream_toolbar);
        if (findViewById != null) {
            findViewById.setVisibility(0);
            return;
        }
        View findViewById2 = view.findViewById(R.id.pre_stream_screencast_toolbar);
        if (findViewById2 != null) {
            findViewById2.setVisibility(0);
            return;
        }
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.lc_pre_stream_stub_actions);
        if (z) {
            viewStub.setLayoutResource(R.layout.lc_pre_stream_screencast_toolbar);
            viewStub.inflate();
            ImageButton imageButton = (ImageButton) view.findViewById(R.id.screen_capture_button);
            this.bb = imageButton;
            imageButton.setOnClickListener(this);
            ImageButton imageButton2 = (ImageButton) view.findViewById(R.id.camera_capture_button);
            this.bc = imageButton2;
            imageButton2.setOnClickListener(this);
        } else {
            viewStub.setLayoutResource(R.layout.lc_pre_stream_toolbar);
            viewStub.inflate();
        }
        this.aX = (ImageButton) view.findViewById(R.id.scheduled_events_button);
        this.aZ = (TextView) view.findViewById(R.id.scheduled_events_count);
        ImageButton imageButton3 = (ImageButton) view.findViewById(R.id.switch_camera_button);
        this.bd = imageButton3;
        imageButton3.setOnClickListener(this);
        aV();
    }

    private final void aV() {
        if (this.bd == null || TextUtils.isEmpty(this.bF)) {
            return;
        }
        this.bd.setContentDescription(this.bF);
    }

    private final void aW() {
        this.al.a(1);
        this.c.b(R.id.pre_stream_network_operation);
    }

    private final void aX() {
        this.al.a(0);
        this.c.b(R.id.pre_stream_network_operation);
    }

    private final void aY(EditLocation editLocation, EditLocation editLocation2) {
        if (this.bM) {
            Place place = editLocation2.d;
            if (place != null || editLocation.d != null) {
                editLocation.c(place);
            }
            editLocation2.setVisibility(8);
            editLocation.setVisibility(0);
        }
    }

    private final void aZ(aulq aulqVar, ImageView imageView) {
        apmg apmgVar = (apmg) ahbj.n(aulqVar, ButtonRendererOuterClass.buttonRenderer);
        if (apmgVar == null || imageView == null) {
            return;
        }
        if ((apmgVar.b & 65536) != 0) {
            aots aotsVar = apmgVar.r;
            if (aotsVar == null) {
                aotsVar = aots.a;
            }
            imageView.setContentDescription(aotsVar.c);
        }
        if ((apmgVar.b & 32) != 0) {
            acfh acfhVar = this.az;
            arfs arfsVar = apmgVar.g;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
            arfr b2 = arfr.b(arfsVar.c);
            if (b2 == null) {
                b2 = arfr.UNKNOWN;
            }
            int a2 = acfhVar.a(b2);
            if (a2 != 0) {
                imageView.setImageResource(a2);
            }
        }
    }

    private final boolean ba() {
        return (this.bb == null || this.bc == null) ? false : true;
    }

    @Override // defpackage.ce
    public final void Z() {
        super.Z();
        q();
        acfm.a(C());
    }

    @Override // defpackage.abxr
    public final void a(int i, String str, aqdt aqdtVar) {
        this.bA = false;
        StringBuilder sb = new StringBuilder(47);
        sb.append("Create broadcast failed statusCode: ");
        sb.append(i);
        zga.l(sb.toString());
        this.c.b(R.id.pre_stream_content);
        if (aqdtVar != null) {
            ajdf.h(C(), aqdtVar, this.av, this.aK, null, false, false, null, null, null, null);
        } else if (acfm.b(this)) {
            Toast.makeText(C(), str != null ? str : O(R.string.lc_error_create_broadcast), 0).show();
        }
    }

    public final void aF(aqzu aqzuVar) {
        if (aqzuVar != null) {
            aone createBuilder = aqzu.a.createBuilder();
            String str = aqzuVar.c;
            createBuilder.copyOnWrite();
            aqzu aqzuVar2 = (aqzu) createBuilder.instance;
            str.getClass();
            aqzuVar2.b |= 1;
            aqzuVar2.c = str;
            String str2 = aqzuVar.e;
            createBuilder.copyOnWrite();
            aqzu aqzuVar3 = (aqzu) createBuilder.instance;
            str2.getClass();
            aqzuVar3.b |= 4;
            aqzuVar3.e = str2;
            this.at = (aqzu) createBuilder.build();
            this.bx.a(aqzuVar.c);
        } else {
            this.at = null;
        }
        this.c.b(R.id.pre_stream_content);
    }

    public final void aG() {
        aX();
        o(5);
    }

    public final void aH() {
        acho achoVar;
        String str;
        boolean z;
        Pair pair;
        if (this.ag.getVisibility() == 0) {
            this.bB = this.ag.getText().toString().trim();
        }
        int i = 3;
        boolean z2 = false;
        if (this.bi.getVisibility() == 0) {
            asgh asghVar = (asgh) this.bi.getSelectedItem();
            i = anaf.bu(asghVar.c == 3 ? ((Integer) asghVar.d).intValue() : 0);
            if (i == 0) {
                i = 1;
            }
        }
        this.bR = i;
        Boolean bool = this.bJ;
        if (bool == null || !bool.booleanValue()) {
            this.bG = this.ai.d;
        } else {
            this.bG = this.aj.d;
        }
        acjx acjxVar = this.af;
        if (acjxVar != null) {
            this.bQ = acjxVar.f();
        }
        acjv acjvVar = this.ae;
        if (acjvVar != null) {
            acjy acjyVar = acjvVar.d;
            this.ao = acjyVar == null ? null : Boolean.valueOf(acjyVar.c());
            acjy acjyVar2 = this.ae.i;
            this.ap = acjyVar2 == null ? null : Boolean.valueOf(acjyVar2.c());
            this.bH = null;
            acjv acjvVar2 = this.ae;
            aone createBuilder = arno.a.createBuilder();
            acjy acjyVar3 = acjvVar2.e;
            Boolean valueOf = acjyVar3 == null ? null : Boolean.valueOf(acjyVar3.c());
            acjy acjyVar4 = acjvVar2.f;
            Boolean valueOf2 = acjyVar4 == null ? null : Boolean.valueOf(acjyVar4.c());
            acjy acjyVar5 = acjvVar2.g;
            Boolean valueOf3 = acjyVar5 == null ? null : Boolean.valueOf(acjyVar5.c());
            Spinner spinner = acjvVar2.b;
            String str2 = "";
            if (spinner == null || spinner.getVisibility() != 0) {
                str = null;
            } else {
                asgh asghVar2 = (asgh) acjvVar2.b.getSelectedItem();
                str = asghVar2.c == 2 ? (String) asghVar2.d : "";
            }
            acjy acjyVar6 = acjvVar2.h;
            Boolean valueOf4 = acjyVar6 == null ? null : Boolean.valueOf(acjyVar6.c());
            Spinner spinner2 = acjvVar2.c;
            if (spinner2 == null || spinner2.getVisibility() != 0) {
                str2 = null;
            } else {
                asgh asghVar3 = (asgh) acjvVar2.c.getSelectedItem();
                if (asghVar3.c == 2) {
                    str2 = (String) asghVar3.d;
                }
            }
            aone createBuilder2 = arnn.a.createBuilder();
            if (valueOf != null) {
                boolean booleanValue = valueOf.booleanValue();
                createBuilder2.copyOnWrite();
                arnn arnnVar = (arnn) createBuilder2.instance;
                arnnVar.b |= 1;
                arnnVar.c = booleanValue;
                createBuilder.copyOnWrite();
                arno.a((arno) createBuilder.instance);
                if (valueOf.booleanValue() && valueOf2 != null) {
                    boolean booleanValue2 = valueOf2.booleanValue();
                    createBuilder2.copyOnWrite();
                    arnn arnnVar2 = (arnn) createBuilder2.instance;
                    arnnVar2.b = 2 | arnnVar2.b;
                    arnnVar2.d = booleanValue2;
                    createBuilder.copyOnWrite();
                    arno.b((arno) createBuilder.instance);
                }
                z = true;
            } else {
                z = false;
            }
            if (valueOf3 != null) {
                boolean booleanValue3 = valueOf3.booleanValue();
                createBuilder2.copyOnWrite();
                arnn arnnVar3 = (arnn) createBuilder2.instance;
                arnnVar3.b |= 4;
                arnnVar3.e = booleanValue3;
                createBuilder.copyOnWrite();
                arno.c((arno) createBuilder.instance);
                z = true;
            }
            if (str != null) {
                createBuilder2.copyOnWrite();
                arnn arnnVar4 = (arnn) createBuilder2.instance;
                arnnVar4.b |= 8;
                arnnVar4.f = str;
                createBuilder.copyOnWrite();
                arno.d((arno) createBuilder.instance);
                z = true;
            }
            if (valueOf4 != null) {
                boolean booleanValue4 = valueOf4.booleanValue();
                createBuilder2.copyOnWrite();
                arnn arnnVar5 = (arnn) createBuilder2.instance;
                arnnVar5.b |= 16;
                arnnVar5.g = booleanValue4;
                createBuilder.copyOnWrite();
                arno.e((arno) createBuilder.instance);
                if (valueOf4.booleanValue() && str2 != null) {
                    createBuilder2.copyOnWrite();
                    arnn arnnVar6 = (arnn) createBuilder2.instance;
                    arnnVar6.b |= 32;
                    arnnVar6.h = str2;
                    createBuilder.copyOnWrite();
                    arno.f((arno) createBuilder.instance);
                }
            } else if (!z) {
                pair = null;
                this.aq = (arnn) pair.first;
                this.bK = (arno) pair.second;
            }
            pair = new Pair((arnn) createBuilder2.build(), (arno) createBuilder.build());
            this.aq = (arnn) pair.first;
            this.bK = (arno) pair.second;
        }
        if (this.bh.getVisibility() == 0) {
            this.bC = this.ah.getText().toString().trim();
        }
        acjy acjyVar7 = this.bu;
        if (acjyVar7 == null) {
            this.bD = null;
        } else if (!acjyVar7.c() || (achoVar = this.bv) == null) {
            this.bD = b;
        } else {
            this.bD = achoVar.a();
        }
        abvt b2 = abvt.b();
        Date date = this.bD;
        if (date != null && date.getTime() > 0) {
            z2 = true;
        }
        b2.g = z2;
    }

    public final void aI(CharSequence charSequence) {
        this.bF = charSequence;
        aV();
    }

    public final void aJ() {
        int i = this.d;
        if (i == -1) {
            this.c.b(R.id.pre_stream_content);
        } else {
            this.c.b(i);
        }
    }

    public final void aK() {
        ImageButton imageButton;
        apxf apxfVar = this.bP;
        if (apxfVar == null || !apxfVar.pY(GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint.getScheduledBroadcastsEndpoint) || (imageButton = this.aX) == null || imageButton.getVisibility() != 0) {
            return;
        }
        this.av.c(this.bP, amrz.k("com.google.android.libraries.youtube.innertube.endpoint.tag", this));
    }

    public final boolean aL() {
        int f;
        acjx acjxVar = this.af;
        return (acjxVar == null || (f = acjxVar.f()) == 1 || f == 4 || f == 2) ? false : true;
    }

    public final boolean aM() {
        if (this.aP.m()) {
            aosc a2 = this.aL.a();
            if (a2 == null) {
                return true;
            }
            return a2.e;
        }
        return this.aH.getBoolean("IS_FIRST_STREAM", true);
    }

    public final boolean aN() {
        return Boolean.TRUE.equals(this.bJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:421:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x080b  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aP(android.view.View r19, defpackage.aone r20) {
        /*
            Method dump skipped, instructions count: 2162
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acjl.aP(android.view.View, aone):void");
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // defpackage.abxr
    public final void b(String str, atfp atfpVar) {
        apxf apxfVar;
        this.bA = false;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "Created broadcast with videoId: ".concat(valueOf);
        }
        if ((atfpVar.b & 2) != 0) {
            apxfVar = atfpVar.c;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        this.bO = apxfVar;
        this.aB.al(str, apxfVar);
        aX();
        this.av.c(this.bO, amrz.k("com.google.android.libraries.youtube.innertube.endpoint.tag", this));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // defpackage.abxu
    public final void c() {
        zga.l("GetBroadcastsSchedule failed");
    }

    @Override // defpackage.abxu
    public final void d(atfe atfeVar) {
        if (!acfm.b(this) || atfeVar == null || this.aX == null || this.aZ == null) {
            return;
        }
        TypedValue typedValue = new TypedValue();
        if (atfeVar.f > 0) {
            qX().getValue(R.dimen.lc_button_active_opacity, typedValue, true);
            this.aX.setOnClickListener(this);
            this.aX.setClickable(true);
            this.aZ.setVisibility(0);
        } else {
            qX().getValue(R.dimen.lc_button_inactive_opacity, typedValue, true);
            this.aX.setOnClickListener(null);
            this.aX.setClickable(false);
            this.aZ.setVisibility(8);
        }
        this.aX.setAlpha(typedValue.getFloat());
        this.aZ.setText(String.format("%d", Integer.valueOf(atfeVar.f)));
    }

    @Override // defpackage.abxw
    public final void e() {
        this.bA = false;
        zga.l("Get confirm broadcast failed");
        if (acfm.b(this)) {
            Toast.makeText(C(), R.string.lc_error_update_broadcast, 0).show();
            this.c.b(R.id.pre_stream_content);
        }
    }

    @Override // defpackage.abxw
    public final void h(arrn arrnVar) {
        atey ateyVar;
        this.bA = false;
        if (acfm.b(this)) {
            arrl arrlVar = arrnVar.c;
            if (arrlVar == null) {
                arrlVar = arrl.a;
            }
            if (arrlVar.b != 126007832) {
                e();
                return;
            }
            arrl arrlVar2 = arrnVar.c;
            if (arrlVar2 == null) {
                arrlVar2 = arrl.a;
            }
            if (arrlVar2.b == 126007832) {
                ateyVar = (atey) arrlVar2.c;
            } else {
                ateyVar = atey.a;
            }
            if (this.bz) {
                this.aB.G(ateyVar);
                this.al.a(2);
            } else {
                this.aB.I(ateyVar);
                this.aB.W(l());
                this.al.a(2);
            }
            acjk acjkVar = this.aB;
            avxs avxsVar = arrnVar.d;
            if (avxsVar == null) {
                avxsVar = avxs.a;
            }
            acjkVar.am(avxsVar);
        }
    }

    @Override // defpackage.abxz
    public final void j() {
        aW();
    }

    @Override // defpackage.abxz
    public final void k() {
        if (this.bO == null) {
            this.aB.W(l());
            this.al.a(2);
        } else {
            aX();
            this.av.c(this.bO, amrz.k("com.google.android.libraries.youtube.innertube.endpoint.tag", this));
        }
    }

    @Override // defpackage.abzm
    public final StreamMetadata l() {
        aH();
        StreamMetadata streamMetadata = new StreamMetadata();
        streamMetadata.a = this.bB;
        streamMetadata.b = this.bC;
        streamMetadata.c = this.ao;
        streamMetadata.d = this.ap;
        streamMetadata.e = this.bH;
        streamMetadata.l = this.bQ;
        streamMetadata.f = this.bJ;
        streamMetadata.g = this.aq;
        streamMetadata.h = this.bK;
        streamMetadata.m = this.bR;
        streamMetadata.i = this.bG;
        streamMetadata.j = this.bD;
        Boolean bool = this.bJ;
        aqzu aqzuVar = null;
        if (bool != null && bool.booleanValue()) {
            aqzuVar = this.at;
        }
        streamMetadata.k = aqzuVar;
        return streamMetadata;
    }

    @Override // defpackage.ce
    public final void lZ() {
        super.lZ();
        if (this.ag.isFocused()) {
            whu.C(this.ag);
        }
    }

    @Override // defpackage.ce
    public final void mQ(Bundle bundle) {
        bundle.putBoolean("STATE_INTENT_ACTION_LOGGED", this.by);
        atfn atfnVar = this.ar;
        if (atfnVar != null) {
            bundle.putParcelable("STATE_TITLE_SCREEN_RENDERER", new ParcelableMessageLite(atfnVar));
        }
        bundle.putInt("STATE_DISPLAYED_VIEW_ID", this.c.a());
        apxf apxfVar = this.bO;
        if (apxfVar != null) {
            bundle.putParcelable("STATE_BROADCAST_CREATED_ENDPOINT", new ParcelableMessageLite(apxfVar));
        }
        apxf apxfVar2 = this.bP;
        if (apxfVar2 != null) {
            bundle.putParcelable("STATE_SCHEDULED_EVENTS_ENDPOINT", new ParcelableMessageLite(apxfVar2));
        }
        bundle.putBoolean("STATE_MORE_OPTIONS_SHOWN", this.bE);
        aH();
        String str = this.bB;
        if (str != null) {
            bundle.putString("STREAM_TITLE", str);
        }
        String str2 = this.bC;
        if (str2 != null) {
            bundle.putString("STATE_STREAM_DESCRIPTION", str2);
        }
        int i = this.bR;
        if (i != 0) {
            bundle.putInt("STATE_STREAM_PRIVACY", i - 1);
        }
        int i2 = this.bQ;
        if (i2 != 0) {
            bundle.putInt("STATE_AUDIENCE_TYPE", i2 - 1);
        }
        Place place = this.bG;
        if (place != null) {
            bundle.putParcelable("STATE_PLACE", place);
        }
        Boolean bool = this.ao;
        if (bool != null) {
            bundle.putBoolean("STATE_ENABLE_CHAT", bool.booleanValue());
        }
        Boolean bool2 = this.ap;
        if (bool2 != null) {
            bundle.putBoolean("STATE_ENABLE_SPONSORS_ONLY_LIVE_CHAT_MODE", bool2.booleanValue());
        }
        Boolean bool3 = this.bH;
        if (bool3 != null) {
            bundle.putBoolean("STATE_ENABLE_AGE_RESTRICTION", bool3.booleanValue());
        }
        Boolean bool4 = this.bJ;
        if (bool4 != null) {
            bundle.putBoolean("STATE_IS_SCREENCAST", bool4.booleanValue());
        }
        arnn arnnVar = this.aq;
        if (arnnVar != null) {
            bundle.putParcelable("STATE_MONETIZATION_METADATA", new ParcelableMessageLite(arnnVar));
        }
        Date date = this.bD;
        if (date != null) {
            bundle.putSerializable("STATE_SCHEDULED_DATE", date);
        }
        aqzu aqzuVar = this.at;
        if (aqzuVar != null) {
            bundle.putParcelable("STATE_GAME_TITLE", new ParcelableMessageLite(aqzuVar));
        }
        bundle.putBoolean("STATE_AADC_WARNING_ACK", this.an);
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        ParcelableMessageLite parcelableMessageLite;
        ParcelableMessageLite parcelableMessageLite2;
        ParcelableMessageLite parcelableMessageLite3;
        ParcelableMessageLite parcelableMessageLite4;
        super.mR(bundle);
        this.aD.a = this;
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            if (bundle2.containsKey("ARG_TITLE")) {
                this.bB = bundle2.getString("ARG_TITLE");
            }
            apxf apxfVar = null;
            if (bundle2.containsKey("ARG_DESCRIPTION")) {
                String string = bundle2.getString("ARG_DESCRIPTION");
                this.bC = TextUtils.isEmpty(string) ? null : string.trim();
            }
            if (bundle2.containsKey("ARG_STREAM_PRIVACY")) {
                this.bR = anaf.bu(bundle2.getInt("ARG_STREAM_PRIVACY", 0));
            }
            if (bundle2.containsKey("ARG_AUDIENCE_TYPE")) {
                this.bQ = amkq.dm(bundle2.getInt("ARG_AUDIENCE_TYPE", 0));
            }
            if (bundle2.containsKey("ARG_PLACE")) {
                this.bG = (Place) bundle2.getParcelable("ARG_PLACE");
            }
            if (bundle2.containsKey("ARG_ENABLE_CHAT")) {
                this.ao = Boolean.valueOf(bundle2.getBoolean("ARG_ENABLE_CHAT"));
            }
            if (bundle2.containsKey("ARG_ENABLE_SPONSORS_ONLY_LIVE_CHAT_MODE")) {
                this.ap = Boolean.valueOf(bundle2.getBoolean("ARG_ENABLE_SPONSORS_ONLY_LIVE_CHAT_MODE"));
            }
            if (bundle2.containsKey("ARG_ENABLE_AGE_RESTRICTION")) {
                this.bH = Boolean.valueOf(bundle2.getBoolean("ARG_ENABLE_AGE_RESTRICTION"));
            }
            if (bundle2.containsKey("ARG_IS_LAUNCHED_FROM_INTENT")) {
                this.bI = Boolean.valueOf(bundle2.getBoolean("ARG_IS_LAUNCHED_FROM_INTENT"));
            }
            if (bundle2.containsKey("ARG_IS_SCREENCAST")) {
                this.bJ = Boolean.valueOf(bundle2.getBoolean("ARG_IS_SCREENCAST"));
            }
            if (bundle2.containsKey("ARG_MONETIZATION_METADATA") && (parcelableMessageLite4 = (ParcelableMessageLite) bundle2.getParcelable("ARG_MONETIZATION_METADATA")) != null) {
                this.aq = (arnn) parcelableMessageLite4.a(arnn.a);
            }
            if (bundle2.containsKey("ARG_CAMERA_COUNT")) {
                this.bL = bundle2.getInt("ARG_CAMERA_COUNT");
            }
            if (bundle2.containsKey("ARG_BROADCAST_CREATED_ENDPOINT") && (parcelableMessageLite3 = (ParcelableMessageLite) bundle2.getParcelable("ARG_BROADCAST_CREATED_ENDPOINT")) != null) {
                this.bO = (apxf) parcelableMessageLite3.a(apxf.a);
            }
            if (bundle2.containsKey("ARG_SCHEDULED_DATE")) {
                this.bD = (Date) bundle2.getSerializable("ARG_SCHEDULED_DATE");
            }
            if (bundle2.containsKey("ARG_GAME_TITLE") && (parcelableMessageLite2 = (ParcelableMessageLite) bundle2.getParcelable("ARG_GAME_TITLE")) != null) {
                this.at = (aqzu) parcelableMessageLite2.a(aqzu.a);
            }
            if (bundle2.containsKey("ARG_GAME_PACKAGE_NAME")) {
                this.am = bundle2.getString("ARG_GAME_PACKAGE_NAME");
            }
            if (bundle2.containsKey("ARG_AADC_WARNING_ACK")) {
                this.an = bundle2.getBoolean("ARG_AADC_WARNING_ACK");
            }
            if (!bundle2.containsKey("ARG_GET_BROADCAST_RESPONSE") || (parcelableMessageLite = (ParcelableMessageLite) bundle2.getParcelable("ARG_GET_BROADCAST_RESPONSE")) == null) {
                return;
            }
            arqu arquVar = ((arqx) parcelableMessageLite.a(arqx.a)).e;
            if (arquVar == null) {
                arquVar = arqu.a;
            }
            atfc atfcVar = arquVar.b;
            if (atfcVar == null) {
                atfcVar = atfc.a;
            }
            atfd atfdVar = atfcVar.c;
            if (atfdVar == null) {
                atfdVar = atfd.a;
            }
            atfn atfnVar = atfdVar.c;
            if (atfnVar == null) {
                atfnVar = atfn.a;
            }
            this.ar = atfnVar;
            this.bz = true;
            atfi atfiVar = atfnVar.g;
            if (atfiVar == null) {
                atfiVar = atfi.a;
            }
            apmg apmgVar = atfiVar.c;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
            if ((apmgVar.b & 8192) != 0) {
                atfi atfiVar2 = this.ar.g;
                if (atfiVar2 == null) {
                    atfiVar2 = atfi.a;
                }
                apmg apmgVar2 = atfiVar2.c;
                if (apmgVar2 == null) {
                    apmgVar2 = apmg.a;
                }
                apxfVar = apmgVar2.n;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
            }
            this.bO = apxfVar;
            this.bJ = Boolean.valueOf(this.ar.p);
        }
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        String path;
        String trim;
        ParcelableMessageLite parcelableMessageLite;
        ParcelableMessageLite parcelableMessageLite2;
        ParcelableMessageLite parcelableMessageLite3;
        ParcelableMessageLite parcelableMessageLite4;
        ParcelableMessageLite parcelableMessageLite5;
        int i2 = 0;
        if (bundle != null) {
            this.by = bundle.getBoolean("STATE_INTENT_ACTION_LOGGED", false);
            if (bundle.containsKey("STREAM_TITLE")) {
                this.bB = bundle.getString("STREAM_TITLE");
            }
            if (bundle.containsKey("STATE_MORE_OPTIONS_SHOWN")) {
                this.bE = bundle.getBoolean("STATE_MORE_OPTIONS_SHOWN");
            }
            if (bundle.containsKey("STATE_STREAM_DESCRIPTION")) {
                this.bC = bundle.getString("STATE_STREAM_DESCRIPTION");
            }
            if (bundle.containsKey("STATE_ENABLE_CHAT")) {
                this.ao = Boolean.valueOf(bundle.getBoolean("STATE_ENABLE_CHAT"));
            }
            if (bundle.containsKey("STATE_ENABLE_SPONSORS_ONLY_LIVE_CHAT_MODE")) {
                this.ap = Boolean.valueOf(bundle.getBoolean("STATE_ENABLE_SPONSORS_ONLY_LIVE_CHAT_MODE"));
            }
            if (bundle.containsKey("STATE_STREAM_PRIVACY")) {
                this.bR = anaf.bu(bundle.getInt("STATE_STREAM_PRIVACY", 0));
            }
            if (bundle.containsKey("STATE_AUDIENCE_TYPE")) {
                this.bQ = amkq.dm(bundle.getInt("STATE_AUDIENCE_TYPE", 0));
            }
            if (bundle.containsKey("STATE_PLACE")) {
                this.bG = (Place) bundle.getParcelable("STATE_PLACE");
            }
            if (bundle.containsKey("STATE_ENABLE_AGE_RESTRICTION")) {
                this.bH = Boolean.valueOf(bundle.getBoolean("STATE_ENABLE_AGE_RESTRICTION"));
            }
            if (bundle.containsKey("STATE_IS_SCREENCAST")) {
                this.bJ = Boolean.valueOf(bundle.getBoolean("STATE_IS_SCREENCAST"));
            }
            if (bundle.containsKey("STATE_MONETIZATION_METADATA") && (parcelableMessageLite5 = (ParcelableMessageLite) bundle.getParcelable("STATE_MONETIZATION_METADATA")) != null) {
                this.aq = (arnn) parcelableMessageLite5.a(arnn.a);
            }
            if (bundle.containsKey("STATE_SCHEDULED_DATE")) {
                this.bD = (Date) bundle.getSerializable("STATE_SCHEDULED_DATE");
            }
            if (bundle.containsKey("STATE_TITLE_SCREEN_RENDERER") && (parcelableMessageLite4 = (ParcelableMessageLite) bundle.getParcelable("STATE_TITLE_SCREEN_RENDERER")) != null) {
                this.ar = (atfn) parcelableMessageLite4.a(atfn.a);
            }
            if (bundle.containsKey("STATE_BROADCAST_CREATED_ENDPOINT") && (parcelableMessageLite3 = (ParcelableMessageLite) bundle.getParcelable("STATE_BROADCAST_CREATED_ENDPOINT")) != null) {
                this.bO = (apxf) parcelableMessageLite3.a(apxf.a);
            }
            if (bundle.containsKey("STATE_SCHEDULED_EVENTS_ENDPOINT") && (parcelableMessageLite2 = (ParcelableMessageLite) bundle.getParcelable("STATE_BROADCAST_CREATED_ENDPOINT")) != null) {
                this.bP = (apxf) parcelableMessageLite2.a(apxf.a);
            }
            if (bundle.containsKey("STATE_GAME_TITLE") && (parcelableMessageLite = (ParcelableMessageLite) bundle.getParcelable("STATE_GAME_TITLE")) != null) {
                this.at = (aqzu) parcelableMessageLite.a(aqzu.a);
            }
            if (bundle.containsKey("STATE_AADC_WARNING_ACK")) {
                this.an = bundle.getBoolean("STATE_AADC_WARNING_ACK");
            }
        }
        View inflate = layoutInflater.inflate(R.layout.lc_pre_stream_fragment, viewGroup, false);
        ViewAnimatorHelper viewAnimatorHelper = (ViewAnimatorHelper) inflate.findViewById(R.id.lc_pre_stream_view_animator);
        this.c = viewAnimatorHelper;
        acjb acjbVar = new acjb(this, 1);
        int i3 = R.id.pre_stream_content;
        viewAnimatorHelper.c(R.id.pre_stream_content, acjbVar);
        this.c.c(R.id.pre_stream_advanced_settings, new zfi() { // from class: acja
            /* JADX WARN: Removed duplicated region for block: B:7:0x0064 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0065  */
            @Override // defpackage.zfi
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(java.lang.Object r11) {
                /*
                    Method dump skipped, instructions count: 396
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.acja.a(java.lang.Object):void");
            }
        });
        this.c.c(R.id.pre_stream_location_search, new acjb(this, i2));
        this.c.c(R.id.game_title_search, new acjb(this, 2));
        this.aU = inflate.findViewById(R.id.pre_stream_content);
        this.aV = (ImageButton) inflate.findViewById(R.id.navigate_back_button);
        this.be = (ViewGroup) inflate.findViewById(R.id.title_container);
        this.bf = (ImageView) inflate.findViewById(R.id.profile_image);
        this.ag = (EditTextTitle) inflate.findViewById(R.id.stream_title);
        this.ah = (EditText) inflate.findViewById(R.id.stream_description);
        this.bh = (TextInputLayout) inflate.findViewById(R.id.stream_description_wrapper);
        this.bi = (Spinner) inflate.findViewById(R.id.privacy_spinner);
        this.ai = (EditLocation) inflate.findViewById(R.id.camera_location_editor);
        this.bn = inflate.findViewById(R.id.schedule_setting);
        this.bo = (TextView) inflate.findViewById(R.id.schedule_setting_text);
        this.bp = (SwitchCompat) inflate.findViewById(R.id.schedule_setting_toggle);
        this.bq = inflate.findViewById(R.id.advanced_setting);
        this.br = (TextView) inflate.findViewById(R.id.advanced_setting_text);
        this.bj = (ViewGroup) inflate.findViewById(R.id.more_options);
        this.bk = (ViewGroup) inflate.findViewById(R.id.scheduled_date_time);
        this.bl = (TextView) inflate.findViewById(R.id.scheduled_date);
        this.bm = (TextView) inflate.findViewById(R.id.scheduled_time);
        this.bs = inflate.findViewById(R.id.options_setting);
        this.bt = (TextView) inflate.findViewById(R.id.options_setting_text);
        this.ak = (Button) inflate.findViewById(R.id.start_stream_button);
        this.al = (NetworkOperationView) inflate.findViewById(R.id.pre_stream_network_operation);
        this.ba = (FrameLayout) inflate.findViewById(R.id.pre_stream_audience_settings_option);
        this.bx = (LiveCreationSettingView) inflate.findViewById(R.id.game_title);
        this.aj = (EditLocation) inflate.findViewById(R.id.screencast_location_editor);
        inflate.setOnClickListener(this);
        this.aU.setOnClickListener(this);
        this.aV.setOnClickListener(this);
        this.ak.setOnClickListener(this);
        this.bx.a = new acjd(this);
        this.al.b(new acjg(this, 1));
        this.ag.addTextChangedListener(this);
        aone createBuilder = asht.a.createBuilder();
        Intent intent = C().getIntent();
        if (intent != null && !this.by) {
            aone createBuilder2 = ashr.a.createBuilder();
            this.by = true;
            Uri cp = adyu.cp(intent);
            if (cp == null || (path = cp.getPath()) == null) {
                trim = null;
            } else {
                while (path.length() > 1 && path.startsWith("/")) {
                    path = path.substring(1);
                }
                trim = path.trim();
            }
            if (trim != null) {
                createBuilder2.copyOnWrite();
                ashr ashrVar = (ashr) createBuilder2.instance;
                ashrVar.b = 2 | ashrVar.b;
                ashrVar.d = trim;
            }
            if (!TextUtils.isEmpty(intent.getAction())) {
                String action = intent.getAction();
                createBuilder2.copyOnWrite();
                ashr ashrVar2 = (ashr) createBuilder2.instance;
                action.getClass();
                ashrVar2.b = 1 | ashrVar2.b;
                ashrVar2.c = action;
            }
            createBuilder.copyOnWrite();
            asht ashtVar = (asht) createBuilder.instance;
            ashr ashrVar3 = (ashr) createBuilder2.build();
            ashrVar3.getClass();
            ashtVar.k = ashrVar3;
            ashtVar.b |= 8192;
            zhq.h(intent.getAction()).length();
            zhq.h(trim).length();
        }
        this.aK.d(acsb.b(26107), null, (asht) createBuilder.build());
        atfn atfnVar = this.ar;
        if (atfnVar != null) {
            aone builder = atfnVar.toBuilder();
            aP(inflate, builder);
            this.ar = (atfn) builder.build();
        }
        if (bundle != null && (i = bundle.getInt("STATE_DISPLAYED_VIEW_ID", -1)) != -1) {
            i3 = i;
        }
        this.c.b(i3);
        return inflate;
    }

    public final void o(final int i) {
        if (this.bz) {
            this.al.a(2);
            aJ();
            return;
        }
        this.al.c(new acjg(this, 0));
        if (i <= 0) {
            aW();
            return;
        }
        Context qR = qR();
        if (!this.aP.o() || qR == null || !akai.g(qR)) {
            p(null, i);
        } else {
            this.aC.b(new afos() { // from class: acix
                @Override // defpackage.afos
                public final void a(astx astxVar) {
                    acjl.this.p(astxVar, i);
                }
            });
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton == this.bp) {
            if (z) {
                this.bv.b();
            } else {
                this.bv.a.setVisibility(8);
            }
            this.ag.clearFocus();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final aone aQ;
        View view2 = this.O;
        if (view2 == null) {
            return;
        }
        if (view == view2 || view == this.aU) {
            if (this.ag.isFocused()) {
                whu.C(this.ag);
                return;
            }
            return;
        }
        if (view == this.aV) {
            s();
            return;
        }
        if (view == this.bq) {
            whu.C(this.ag);
            byte[] bArr = this.aW;
            if (bArr != null) {
                this.aK.I(3, new acqx(bArr), null);
            }
            this.c.b(R.id.pre_stream_advanced_settings);
            return;
        }
        if (view == this.aX) {
            whu.C(this.ag);
            byte[] bArr2 = this.aY;
            if (bArr2 != null) {
                this.aK.I(3, new acqx(bArr2), null);
            }
            this.aB.Z();
            return;
        }
        if (view == this.bb) {
            aT();
            return;
        }
        if (view == this.bc) {
            aS();
            return;
        }
        ImageButton imageButton = this.bd;
        if (view == imageButton) {
            this.aB.ab(imageButton);
            return;
        }
        if (view != this.ak) {
            if (view == this.bf) {
                this.av.c(this.bg, null);
                return;
            }
            View view3 = this.bs;
            if (view == view3) {
                Object tag = view3.getTag();
                this.ag.clearFocus();
                if (tag instanceof asge) {
                    asge asgeVar = (asge) tag;
                    if (this.bj.getVisibility() == 8) {
                        TextView textView = this.bt;
                        aqyg aqygVar = asgeVar.c;
                        if (aqygVar == null) {
                            aqygVar = aqyg.a;
                        }
                        textView.setText(ajcq.b(aqygVar));
                        this.bj.setVisibility(0);
                        this.bE = true;
                        this.bh.setVisibility(0);
                        return;
                    }
                    TextView textView2 = this.bt;
                    aqyg aqygVar2 = asgeVar.d;
                    if (aqygVar2 == null) {
                        aqygVar2 = aqyg.a;
                    }
                    textView2.setText(ajcq.b(aqygVar2));
                    this.bj.setVisibility(8);
                    this.bE = false;
                    this.bh.setVisibility(8);
                    return;
                }
                return;
            }
            return;
        }
        Editable text = this.ag.getText();
        whu.C(this.ag);
        if (!aO(text)) {
            if (text.length() == 0) {
                Toast.makeText(C(), R.string.lc_must_add_title, 0).show();
                return;
            } else {
                Toast.makeText(C(), R.string.lc_title_too_long, 0).show();
                return;
            }
        }
        acjy acjyVar = this.bu;
        if (acjyVar != null && acjyVar.c() && this.bv.a().before(new Date(this.aE.c() - a))) {
            Toast.makeText(C(), R.string.lc_error_scheduled_date_in_past, 1).show();
            return;
        }
        if (aM()) {
            if (this.aP.m()) {
                ynm.n(this, this.aL.a.b(new aard(15), angq.a), zxq.t, zxq.q);
            } else {
                this.aH.edit().putBoolean("IS_FIRST_STREAM", false).apply();
            }
        }
        if (this.bA) {
            return;
        }
        if (this.bO == null) {
            Object tag2 = this.ak.getTag();
            if (tag2 instanceof apxf) {
                apxf apxfVar = (apxf) tag2;
                this.bA = true;
                this.aK.D(new acqx(apxfVar.c.I()));
                if ((1 & apxfVar.b) != 0) {
                    this.aK.I(3, new acqx(apxfVar.c.I()), null);
                }
                this.av.c(apxfVar, amrz.k("com.google.android.libraries.youtube.innertube.endpoint.tag", this));
                aX();
                return;
            }
            return;
        }
        StreamMetadata l = l();
        if (this.bz) {
            abxq abxqVar = abxq.a;
            if (Boolean.TRUE.equals(this.bJ)) {
                aqzu aqzuVar = l.k;
                abxqVar = (aqzuVar == null || (aqzuVar.b & 4) == 0) ? abxq.b : abxq.a(aqzuVar.e);
            }
            abxq abxqVar2 = abxqVar;
            abya abyaVar = this.aA;
            String str = ((MobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint) this.bO.pX(MobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint.mobileBroadcastSetupShowGoLiveScreenEndpoint)).b;
            String str2 = l.a;
            String str3 = l.b;
            Boolean bool = l.c;
            Boolean bool2 = l.d;
            Boolean bool3 = l.e;
            Boolean bool4 = l.f;
            arnn arnnVar = l.g;
            arno arnoVar = l.h;
            int i = l.m;
            int i2 = l.l;
            Place place = l.i;
            aQ = abyaVar.l(str, str2, str3, bool, bool2, bool3, bool4, arnnVar, arnoVar, i, i2, place == null ? abxq.b : abxq.a(place), l.j, abxqVar2, null);
        } else {
            aQ = this.aB.aQ(l);
        }
        if (aQ == null) {
            aX();
            this.av.c(this.bO, amrz.k("com.google.android.libraries.youtube.innertube.endpoint.tag", this));
        } else {
            aX();
            this.al.c(new View.OnClickListener() { // from class: aciv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    acjl acjlVar = acjl.this;
                    acjlVar.aA.k(aQ, acjlVar);
                }
            });
            this.aA.k(aQ, this);
        }
    }

    @Override // defpackage.ce, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View view = this.O;
        if (view != null) {
            yny.z(this.be, yny.v(view.getResources().getDimensionPixelOffset(R.dimen.lc_pre_stream_first_input_field_top_margin)), ViewGroup.MarginLayoutParams.class);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (!this.an) {
            atfl atflVar = this.ar.f;
            if (atflVar == null) {
                atflVar = atfl.a;
            }
            asgi asgiVar = atflVar.c;
            if (asgiVar == null) {
                asgiVar = asgi.a;
            }
            apxf apxfVar = ((asgh) asgiVar.c.get(i)).i;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            if (apxfVar.pY(auua.b)) {
                whu.C(this.ag);
                atfl atflVar2 = this.ar.f;
                if (atflVar2 == null) {
                    atflVar2 = atfl.a;
                }
                asgi asgiVar2 = atflVar2.c;
                if (asgiVar2 == null) {
                    asgiVar2 = asgi.a;
                }
                apxf apxfVar2 = ((asgh) asgiVar2.c.get(i)).i;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                aulq aulqVar = ((auua) apxfVar2.pX(auua.b)).c;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                byte[] bArr = ajds.a((aqrf) aulqVar.pX(ElementRendererOuterClass.elementRenderer)).b;
                if (bArr != null) {
                    try {
                        awos awosVar = (awos) aonm.parseFrom(awos.a, bArr, aomw.b());
                        baql baqlVar = new baql();
                        baqlVar.a = this.aK;
                        slq slqVar = new slq(baqlVar.a);
                        ajec ajecVar = this.ay;
                        Object obj = slqVar.a;
                        boolean z = obj instanceof acra;
                        acra acraVar = obj;
                        if (true != z) {
                            acraVar = null;
                        }
                        ajecVar.g(awosVar, 1, 1, acraVar, null, false, 0);
                    } catch (aoob e) {
                        zga.d("Failed to show bottom sheet for aadc warning.", e);
                    }
                }
            }
            atfl atflVar3 = this.ar.f;
            if (atflVar3 == null) {
                atflVar3 = atfl.a;
            }
            asgi asgiVar3 = atflVar3.c;
            if (asgiVar3 == null) {
                asgiVar3 = asgi.a;
            }
            if ((asgiVar3.b & 16) != 0 && this.bN) {
                this.bN = false;
                atfl atflVar4 = this.ar.f;
                if (atflVar4 == null) {
                    atflVar4 = atfl.a;
                }
                asgi asgiVar4 = atflVar4.c;
                if (asgiVar4 == null) {
                    asgiVar4 = asgi.a;
                }
                apxf apxfVar3 = asgiVar4.e;
                if (apxfVar3 == null) {
                    apxfVar3 = apxf.a;
                }
                auum auumVar = (auum) apxfVar3.pX(ShowTooltipCommandOuterClass.showTooltipCommand);
                if ((auumVar.b & 1) != 0) {
                    TypedValue typedValue = new TypedValue();
                    qX().getValue(R.dimen.privacy_spinner_tooltip_width, typedValue, true);
                    aulq aulqVar2 = auumVar.c;
                    if (aulqVar2 == null) {
                        aulqVar2 = aulq.a;
                    }
                    aqyg aqygVar = ((avhy) aulqVar2.pX(TooltipRendererOuterClass.tooltipRenderer)).f;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                    String valueOf = String.valueOf(ajcq.b(aqygVar));
                    akch akchVar = this.aF;
                    akci a2 = akchVar.a();
                    a2.c = valueOf;
                    a2.i(2);
                    a2.c(1);
                    a2.h(typedValue.getFloat());
                    a2.a = this.bi;
                    a2.l();
                    a2.f = new acjf();
                    akchVar.c(a2.a());
                }
            }
        }
        acka ackaVar = this.bw;
        if (ackaVar != null) {
            ackaVar.e = i;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        acka ackaVar = this.bw;
        if (ackaVar != null) {
            ackaVar.e = -1;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        View view = this.O;
        ci C = C();
        if (view == null || C == null) {
            return;
        }
        String trim = charSequence.toString().trim();
        TextView textView = (TextView) view.findViewById(R.id.char_count);
        if (this.af == null) {
            this.ak.setEnabled(aO(trim));
        } else {
            Button button = this.ak;
            if (aO(trim)) {
                int f = this.af.f();
                if (f == 0) {
                    throw null;
                }
                if (f != 1) {
                    z = true;
                    button.setEnabled(z);
                }
            }
            z = false;
            button.setEnabled(z);
        }
        if (trim.length() >= 50) {
            textView.setVisibility(0);
            textView.setText(qX().getString(R.string.lc_character_counter_text, Integer.toString(trim.length()), Integer.toString(60)));
        } else {
            textView.setVisibility(4);
        }
        if (trim.length() > 60) {
            this.ag.getBackground().setColorFilter(aih.d(C, R.color.lc_red), PorterDuff.Mode.SRC_ATOP);
            textView.setTextColor(aih.d(C, R.color.lc_red));
        } else {
            this.ag.getBackground().setColorFilter(aih.d(C, R.color.lc_white), PorterDuff.Mode.SRC_ATOP);
            textView.setTextColor(aih.d(C, R.color.lc_white_70));
        }
    }

    public final void p(astx astxVar, int i) {
        Boolean bool = this.bI;
        int i2 = 2;
        if (bool == null || !bool.booleanValue()) {
            i2 = 0;
        } else {
            Boolean bool2 = this.bJ;
            if (bool2 != null && bool2.booleanValue()) {
                i2 = 3;
            }
        }
        this.aA.j(astxVar, null, i2, new acji(this, i));
    }

    @Override // defpackage.afoe
    public final void r() {
        if (!this.aP.o() || akai.g(qR())) {
            this.c.b(R.id.pre_stream_location_search);
            return;
        }
        PermissionDescriptor permissionDescriptor = aT;
        this.aS = new akam(akal.e(this), this.aQ, Arrays.asList(permissionDescriptor), R.string.lc_permission_open_settings_location_description, R.string.lc_permissions_missing_location, new Runnable() { // from class: aciy
            @Override // java.lang.Runnable
            public final void run() {
                acjl.this.c.b(R.id.pre_stream_location_search);
            }
        }, omm.k, this.aR);
        this.aS.a();
    }

    @Override // defpackage.acju
    public final void s() {
        if (this.c.a() == R.id.pre_stream_content || this.c.a() == R.id.pre_stream_network_operation) {
            this.aB.V();
        } else {
            this.c.b(R.id.pre_stream_content);
            aH();
        }
    }

    public final void q() {
        int i = this.al.c;
        if (i == 1) {
            this.c.b(R.id.pre_stream_network_operation);
            return;
        }
        if (i == 2) {
            aR(this.aW);
            aR(this.aY);
            aJ();
            aK();
            return;
        }
        this.c.b(R.id.pre_stream_network_operation);
        o(5);
        this.aB.y(Boolean.TRUE.equals(this.bJ));
    }
}
