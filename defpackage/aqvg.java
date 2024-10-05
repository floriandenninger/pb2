package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqvg extends aonm implements aooz {
    public static final aqvg a;
    private static volatile aopf d;
    private int e;
    private apxf f;
    private aulq g;
    private apxf h;
    private aulq i;
    private aota j;
    private byte k = 2;
    public aony b = emptyProtobufList();
    public aomf c = aomf.b;

    static {
        aqvg aqvgVar = new aqvg();
        a = aqvgVar;
        aonm.registerDefaultInstance(aqvg.class, aqvgVar);
    }

    private aqvg() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0006\u0001Л\u0002ᐉ\u0000\u0003ᐉ\u0004\u0004ည\u0005\u0005ᐉ\u0001\u0006ᐉ\u0003\u0007ᐉ\u0002", new Object[]{"e", "b", aulq.class, "f", "j", "c", "g", "i", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aqvg();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aqvg.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
