package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class spo implements sqa {
    private final /* synthetic */ int l;
    public static final /* synthetic */ spo k = new spo(10);
    public static final /* synthetic */ spo j = new spo(9);
    public static final /* synthetic */ spo i = new spo(8);
    public static final /* synthetic */ spo h = new spo(7);
    public static final /* synthetic */ spo g = new spo(6);
    public static final /* synthetic */ spo f = new spo(5);
    public static final /* synthetic */ spo e = new spo(4);
    public static final /* synthetic */ spo d = new spo(3);
    public static final /* synthetic */ spo c = new spo(2);
    public static final /* synthetic */ spo b = new spo(1);
    public static final /* synthetic */ spo a = new spo(0);

    private /* synthetic */ spo(int i2) {
        this.l = i2;
    }

    @Override // defpackage.sqa
    public final aoam a(ByteBuffer byteBuffer) {
        switch (this.l) {
            case 0:
                axok axokVar = new axok();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                axokVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return axokVar;
            case 1:
                axog axogVar = new axog();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                axogVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return axogVar;
            case 2:
                axol axolVar = new axol();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                axolVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return axolVar;
            case 3:
                axop axopVar = new axop();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                axopVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return axopVar;
            case 4:
                axoq axoqVar = new axoq();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                axoqVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return axoqVar;
            case 5:
                axos axosVar = new axos();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                axosVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return axosVar;
            case 6:
                axot axotVar = new axot();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                axotVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return axotVar;
            case 7:
                axpb axpbVar = new axpb();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                axpbVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return axpbVar;
            case 8:
                return axpe.aM(byteBuffer);
            case 9:
                return axow.aJ(byteBuffer);
            default:
                return axow.aJ(byteBuffer);
        }
    }
}
