package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import j$.util.Collection;
import j$.util.function.Function;
import j$.util.stream.Collectors;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class opb implements Function {
    private final /* synthetic */ int v;
    public static final /* synthetic */ opb u = new opb(20);
    public static final /* synthetic */ opb t = new opb(19);
    public static final /* synthetic */ opb s = new opb(18);
    public static final /* synthetic */ opb r = new opb(17);
    public static final /* synthetic */ opb q = new opb(16);
    public static final /* synthetic */ opb p = new opb(15);
    public static final /* synthetic */ opb o = new opb(14);
    public static final /* synthetic */ opb n = new opb(13);
    public static final /* synthetic */ opb m = new opb(12);
    public static final /* synthetic */ opb l = new opb(11);
    public static final /* synthetic */ opb k = new opb(10);
    public static final /* synthetic */ opb j = new opb(9);
    public static final /* synthetic */ opb i = new opb(8);
    public static final /* synthetic */ opb h = new opb(7);
    public static final /* synthetic */ opb g = new opb(6);
    public static final /* synthetic */ opb f = new opb(5);
    public static final /* synthetic */ opb e = new opb(4);
    public static final /* synthetic */ opb d = new opb(3);
    public static final /* synthetic */ opb c = new opb(2);
    public static final /* synthetic */ opb b = new opb(1);
    public static final /* synthetic */ opb a = new opb(0);

    private /* synthetic */ opb(int i2) {
        this.v = i2;
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        switch (this.v) {
            case 0:
                return Function.CC.$default$andThen(this, function);
            case 1:
                return Function.CC.$default$andThen(this, function);
            case 2:
                return Function.CC.$default$andThen(this, function);
            case 3:
                return Function.CC.$default$andThen(this, function);
            case 4:
                return Function.CC.$default$andThen(this, function);
            case 5:
                return Function.CC.$default$andThen(this, function);
            case 6:
                return Function.CC.$default$andThen(this, function);
            case 7:
                return Function.CC.$default$andThen(this, function);
            case 8:
                return Function.CC.$default$andThen(this, function);
            case 9:
                return Function.CC.$default$andThen(this, function);
            case 10:
                return Function.CC.$default$andThen(this, function);
            case 11:
                return Function.CC.$default$andThen(this, function);
            case 12:
                return Function.CC.$default$andThen(this, function);
            case 13:
                return Function.CC.$default$andThen(this, function);
            case 14:
                return Function.CC.$default$andThen(this, function);
            case 15:
                return Function.CC.$default$andThen(this, function);
            case 16:
                return Function.CC.$default$andThen(this, function);
            case 17:
                return Function.CC.$default$andThen(this, function);
            case 18:
                return Function.CC.$default$andThen(this, function);
            case 19:
                return Function.CC.$default$andThen(this, function);
            default:
                return Function.CC.$default$andThen(this, function);
        }
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        switch (this.v) {
            case 0:
                return Function.CC.$default$compose(this, function);
            case 1:
                return Function.CC.$default$compose(this, function);
            case 2:
                return Function.CC.$default$compose(this, function);
            case 3:
                return Function.CC.$default$compose(this, function);
            case 4:
                return Function.CC.$default$compose(this, function);
            case 5:
                return Function.CC.$default$compose(this, function);
            case 6:
                return Function.CC.$default$compose(this, function);
            case 7:
                return Function.CC.$default$compose(this, function);
            case 8:
                return Function.CC.$default$compose(this, function);
            case 9:
                return Function.CC.$default$compose(this, function);
            case 10:
                return Function.CC.$default$compose(this, function);
            case 11:
                return Function.CC.$default$compose(this, function);
            case 12:
                return Function.CC.$default$compose(this, function);
            case 13:
                return Function.CC.$default$compose(this, function);
            case 14:
                return Function.CC.$default$compose(this, function);
            case 15:
                return Function.CC.$default$compose(this, function);
            case 16:
                return Function.CC.$default$compose(this, function);
            case 17:
                return Function.CC.$default$compose(this, function);
            case 18:
                return Function.CC.$default$compose(this, function);
            case 19:
                return Function.CC.$default$compose(this, function);
            default:
                return Function.CC.$default$compose(this, function);
        }
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        switch (this.v) {
            case 0:
                return Integer.valueOf(((opl) obj).b);
            case 1:
                return Integer.valueOf(((opl) obj).c);
            case 2:
                return ((String) obj).trim();
            case 3:
                return ((String) obj).split("=");
            case 4:
                Map.Entry entry = (Map.Entry) obj;
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
                sb.append(str);
                sb.append("=");
                sb.append(str2);
                return sb.toString();
            case 5:
                return (String) ((Map.Entry) obj).getKey();
            case 6:
                return ((String[]) obj)[0];
            case 7:
                return ((String[]) obj)[1];
            case 8:
                return amru.p(((StreamConfigurationMap) ((CameraCharacteristics) obj).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(SurfaceTexture.class));
            case 9:
                return ((awyv) obj).b;
            case 10:
                return ((awyv) obj).c;
            case 11:
                return ((ztr) obj).a;
            case 12:
                return ((tjw) obj).c;
            case 13:
                return ((tjw) obj).d;
            case 14:
                return azrh.e();
            case 15:
                return new ArrayList();
            case 16:
                return new HashSet();
            case 17:
                return new HashSet();
            case 18:
                return (String) ((AbstractMap.SimpleEntry) obj).getKey();
            case 19:
                return (awux) ((AbstractMap.SimpleEntry) obj).getValue();
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                long j2 = acyc.a;
                Map map = (Map) Collection.EL.stream(Collections.unmodifiableMap(((awux) entry2.getValue()).e).entrySet()).sorted(unt.j).limit(1000L).collect(Collectors.toMap(acxx.b, acxx.a));
                String str3 = (String) entry2.getKey();
                aone builder = ((awux) entry2.getValue()).toBuilder();
                builder.copyOnWrite();
                ((awux) builder.instance).a().clear();
                builder.copyOnWrite();
                ((awux) builder.instance).a().putAll(map);
                return new AbstractMap.SimpleEntry(str3, (awux) builder.build());
        }
    }
}
