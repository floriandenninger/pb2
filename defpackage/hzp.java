package defpackage;

import android.graphics.Bitmap;
import android.util.Patterns;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hzp extends zys {
    public String a;
    public Bitmap b;
    public EditText c;
    private final ci d;
    private View e;
    private View f;
    private View g;
    private WebView h;
    private YouTubeButton i;
    private final icj j;

    public hzp(ci ciVar, icj icjVar) {
        super(ciVar, ciVar.getSupportFragmentManager(), null, true, false);
        this.d = ciVar;
        this.j = icjVar;
    }

    @Override // defpackage.zys
    protected final View a() {
        View inflate = LayoutInflater.from(new ContextThemeWrapper(this.d, R.style.ReelsBottomSheetDialog)).inflate(R.layout.link_sticker_fragment, (ViewGroup) null);
        this.c = (EditText) inflate.findViewById(R.id.link_input);
        this.f = inflate.findViewById(R.id.clear_input);
        this.g = inflate.findViewById(R.id.scroll_view);
        this.h = (WebView) inflate.findViewById(R.id.link_preview);
        this.e = inflate.findViewById(R.id.link_input_frame);
        this.c.addTextChangedListener(new hzo(this));
        this.c.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: hzl
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                hzp hzpVar = hzp.this;
                if (i != 6) {
                    return false;
                }
                whu.C(hzpVar.c);
                hzpVar.l();
                return true;
            }
        });
        final int i = 1;
        this.f.setOnClickListener(new View.OnClickListener(this) { // from class: hzk
            public final /* synthetic */ hzp a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i != 0) {
                    this.a.c.setText("");
                } else {
                    this.a.l();
                }
            }
        });
        YouTubeButton youTubeButton = (YouTubeButton) inflate.findViewById(R.id.link_sticker_add_button);
        this.i = youTubeButton;
        final int i2 = 0;
        youTubeButton.setOnClickListener(new View.OnClickListener(this) { // from class: hzk
            public final /* synthetic */ hzp a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i2 != 0) {
                    this.a.c.setText("");
                } else {
                    this.a.l();
                }
            }
        });
        m();
        this.h.setWebViewClient(new hzm(this));
        this.h.setWebChromeClient(new hzn(this));
        this.h.setScrollBarStyle(33554432);
        this.h.setScrollbarFadingEnabled(false);
        WebSettings settings = this.h.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            settings.setSupportZoom(true);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
        }
        return inflate;
    }

    @Override // defpackage.zys
    protected final CharSequence c() {
        return this.d.getResources().getString(R.string.stories_add_link_header);
    }

    public final void l() {
        String obj = this.c.getText().toString();
        if (this.g.getVisibility() == 8) {
            if (Patterns.WEB_URL.matcher(obj).matches()) {
                this.e.setVisibility(8);
                this.g.setVisibility(0);
                this.h.loadUrl(obj);
                this.i.setText(R.string.stories_add_link_sticker);
                return;
            }
            return;
        }
        icj icjVar = this.j;
        String str = this.a;
        Bitmap bitmap = this.b;
        View inflate = LayoutInflater.from(icjVar.a.a).inflate(R.layout.link_sticker_card, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.page_title)).setText(str);
        ((TextView) inflate.findViewById(R.id.link_url)).setText(obj);
        if (bitmap != null) {
            ImageView imageView = (ImageView) inflate.findViewById(R.id.icon);
            imageView.setImageBitmap(bitmap);
            imageView.setVisibility(0);
        }
        ick ickVar = icjVar.a;
        aone createBuilder = axdi.a.createBuilder();
        axcw axcwVar = axcw.a;
        createBuilder.copyOnWrite();
        axdi axdiVar = (axdi) createBuilder.instance;
        axcwVar.getClass();
        axdiVar.d = axcwVar;
        axdiVar.c = 13;
        axdi axdiVar2 = (axdi) createBuilder.build();
        axdj j = axdk.j();
        j.copyOnWrite();
        ((axdk) j.instance).F(axdiVar2);
        etx.aq(ickVar.a, ickVar.f, inflate, j, new icb(ickVar.b, 2));
        icjVar.a.d.z();
        this.c.setText("");
    }

    public final void m() {
        if (this.c.getEditableText().length() != 0) {
            this.f.setVisibility(0);
        } else {
            this.f.setVisibility(8);
        }
    }

    @Override // defpackage.zys, defpackage.zyz
    public final boolean mc() {
        if (this.g.getVisibility() != 0) {
            return false;
        }
        if (!this.h.canGoBack()) {
            this.g.setVisibility(8);
            this.e.setVisibility(0);
            this.i.setText(R.string.stories_link_sticker_preview);
            return true;
        }
        this.h.goBack();
        return true;
    }
}
