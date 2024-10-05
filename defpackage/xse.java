package defpackage;

import android.animation.LayoutTransition;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.opengl.EGL14;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.mediapipe.framework.AndroidAssetUtil;
import com.google.mediapipe.framework.AndroidPacketCreator;
import com.google.mediapipe.framework.Graph;
import com.google.mediapipe.framework.MediaPipeException;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.PacketCreator;
import com.google.protos.youtube.api.innertube.BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xse extends xru {
    private static final absg[] ai = {new absg("Normal", "NORMAL"), new absg("Sketch", "SKETCH_IMAGE_FILTER"), new absg("Sepia", "SEPIA_IMAGE_FILTER")};
    public Executor a;
    public String ae;
    public ImageView af;
    public Bitmap ag;
    private Uri ah;
    public xun b;
    public afri c;
    public xsk d;
    public String e;

    public static xse o(BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint, Uri uri) {
        backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.getClass();
        xse xseVar = new xse();
        Bundle bundle = new Bundle();
        amkq.cn(bundle, "image_upload_endpoint", backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint);
        bundle.putParcelable("image_uri", uri);
        xseVar.af(bundle);
        return xseVar;
    }

    @Override // defpackage.ce
    public final void lZ() {
        super.lZ();
        xsh xshVar = this.d.d;
        try {
            xshVar.b.d();
        } catch (MediaPipeException unused) {
        }
        try {
            xshVar.b.j();
        } catch (MediaPipeException unused2) {
        }
        xshVar.b.i();
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        Bundle bundle2 = this.m;
        bundle2.getClass();
        try {
            BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint = (BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint) amkq.cj(bundle2, "image_upload_endpoint", BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.a, aomw.b());
            this.e = backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.c;
            this.ae = backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.d;
            Uri uri = (Uri) bundle2.getParcelable("image_uri");
            uri.getClass();
            this.ah = uri;
        } catch (aoob e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.image_edit_fragment, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.image_filter_layout);
        this.af = (ImageView) inflate.findViewById(R.id.preview_image);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        toolbar.l(R.menu.image_edit_action_menu);
        toolbar.q = new xsd(this);
        toolbar.r(new View.OnClickListener() { // from class: xrz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xse.this.C().onBackPressed();
            }
        });
        toolbar.g().findItem(R.id.done_button).setTitle(O(R.string.done));
        final Uri uri = this.ah;
        this.a.execute(new Runnable() { // from class: xsb
            @Override // java.lang.Runnable
            public final void run() {
                Bitmap bitmap;
                int i;
                final xse xseVar = xse.this;
                Object obj = null;
                try {
                    obj = (Drawable) xseVar.c.b(anbt.c(xseVar.qR().getContentResolver().openInputStream(uri)));
                } catch (FileNotFoundException unused) {
                    zga.b("Failed to find image");
                    xseVar.C().onBackPressed();
                } catch (IOException unused2) {
                    zga.b("Failed to load image");
                    xseVar.C().onBackPressed();
                } catch (zjg unused3) {
                    zga.b("Failed to convert image");
                    xseVar.C().onBackPressed();
                }
                if (!(obj instanceof BitmapDrawable)) {
                    xseVar.C().onBackPressed();
                }
                Bitmap bitmap2 = ((BitmapDrawable) obj).getBitmap();
                int width = bitmap2.getWidth();
                if (width <= 4 || (i = width & 3) == 0) {
                    bitmap = bitmap2;
                } else {
                    int i2 = i >> 1;
                    bitmap = Bitmap.createBitmap(bitmap2, i2, 0, (width - ((int) Math.ceil(i / 2.0f))) - i2, bitmap2.getHeight());
                }
                xseVar.ag = bitmap;
                if (bitmap2 != xseVar.ag) {
                    bitmap2.recycle();
                }
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: xsa
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        xse xseVar2 = xse.this;
                        xseVar2.af.setImageBitmap(xseVar2.ag);
                        xsk xskVar = xseVar2.d;
                        Bitmap bitmap3 = xseVar2.ag;
                        xsh xshVar = xskVar.d;
                        PacketCreator packetCreator = new PacketCreator(xshVar.b);
                        adz adzVar = new adz();
                        String b = aogj.a().b("kazoo/frame_blurred.png");
                        if (b == null || !b.endsWith("frame_blurred.png")) {
                            zga.b("Failed to get asset_base for: frame_blurred.png");
                            str = "";
                        } else {
                            str = b.substring(0, b.length() - 17);
                        }
                        adzVar.put("asset_base", packetCreator.b(str));
                        aogj.a().d();
                        try {
                            xshVar.b.f(adzVar);
                        } catch (MediaPipeException unused4) {
                        }
                        try {
                            xshVar.b.k(EGL14.eglGetCurrentContext().getNativeHandle());
                            xshVar.b.h();
                        } catch (MediaPipeException unused5) {
                        }
                        xsh xshVar2 = xskVar.d;
                        absg[] absgVarArr = xskVar.e;
                        AndroidPacketCreator androidPacketCreator = new AndroidPacketCreator(xshVar2.b);
                        if (bitmap3.getConfig() != Bitmap.Config.ARGB_8888) {
                            throw new RuntimeException("bitmap must use ARGB_8888 config.");
                        }
                        Packet create = Packet.create(androidPacketCreator.nativeCreateRgbaImageFrame(androidPacketCreator.a.a(), bitmap3));
                        try {
                            xshVar2.b.c("video_input", create, 0L);
                        } catch (MediaPipeException unused6) {
                            zga.l("addGpuPacket: image input return false");
                        }
                        create.release();
                        ArrayList arrayList = new ArrayList();
                        int length = absgVarArr.length;
                        for (int i3 = 0; i3 < 3; i3++) {
                            absg absgVar = absgVarArr[i3];
                            aone createBuilder = axei.a.createBuilder();
                            String str2 = absgVar.b;
                            createBuilder.copyOnWrite();
                            axei axeiVar = (axei) createBuilder.instance;
                            axeiVar.b |= 1;
                            axeiVar.c = str2;
                            createBuilder.copyOnWrite();
                            axei axeiVar2 = (axei) createBuilder.instance;
                            axeiVar2.d = 1;
                            axeiVar2.b |= 2;
                            arrayList.add((axei) createBuilder.build());
                        }
                        aone createBuilder2 = axej.a.createBuilder();
                        createBuilder2.bE(arrayList);
                        Packet b2 = androidPacketCreator.b(new String(((axej) createBuilder2.build()).toByteArray(), Charset.forName("UTF-8")));
                        try {
                            xshVar2.b.c("runtime_control", b2, 0L);
                        } catch (MediaPipeException unused7) {
                            zga.l("addGpuPacket: runtime control input return false");
                        }
                        b2.release();
                    }
                });
            }
        });
        xsk xskVar = this.d;
        absg[] absgVarArr = ai;
        ImageView imageView = this.af;
        xskVar.e = absgVarArr;
        xskVar.c = linearLayout;
        xskVar.b = 0;
        xsh xshVar = xskVar.d;
        xshVar.b = new Graph();
        aogj.c(xshVar.a);
        AndroidAssetUtil.a(xshVar.a);
        try {
            Graph graph = xshVar.b;
            try {
                InputStream open = xshVar.a.getAssets().open("image_preview_supergraph.binarypb");
                byte[] c = anbt.c(open);
                open.close();
                graph.e(c);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (MediaPipeException unused) {
        }
        int i = 0;
        while (true) {
            absg[] absgVarArr2 = xskVar.e;
            int length = absgVarArr2.length;
            if (i < 3) {
                absg absgVar = absgVarArr2[i];
                ViewGroup viewGroup2 = xskVar.c;
                View inflate2 = LayoutInflater.from(xskVar.a).inflate(R.layout.image_filter_list_item, viewGroup2, false);
                LayoutTransition layoutTransition = new LayoutTransition();
                layoutTransition.enableTransitionType(4);
                ((ViewGroup) inflate2).setLayoutTransition(layoutTransition);
                ((TextView) inflate2.findViewById(R.id.filter_text)).setText(absgVar.a);
                ImageView imageView2 = (ImageView) inflate2.findViewById(R.id.filter_thumbnail);
                imageView2.setImageDrawable(new ColorDrawable(-16777216));
                int childCount = viewGroup2.getChildCount();
                inflate2.setOnClickListener(new xsi(xskVar, childCount, imageView));
                xsh xshVar2 = xskVar.d;
                xsj xsjVar = new xsj(xskVar, imageView2, childCount, imageView);
                String str = true != absgVar.a.equals("Normal") ? "_image_filter_preview" : "_preview";
                String lowerCase = absgVar.a.toLowerCase(Locale.US);
                StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 7 + str.length());
                sb.append("render_");
                sb.append(lowerCase);
                sb.append(str);
                xshVar2.b.b(sb.toString(), new xsg(xsjVar));
                viewGroup2.addView(inflate2);
                i++;
            } else {
                xskVar.a();
                return inflate;
            }
        }
    }
}
