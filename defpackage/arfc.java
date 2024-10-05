package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arfc extends aonh implements aoni {
    public static final arfc a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private apxf e;
    private aulq f;
    private aulq g;
    private aota h;
    private byte i = 2;

    static {
        arfc arfcVar = new arfc();
        a = arfcVar;
        aonm.registerDefaultInstance(arfc.class, arfcVar);
    }

    private arfc() {
        emptyProtobufList();
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\u0007\u0005\u0000\u0000\u0005\u0002ᐉ\u0004\u0003ᐉ\u0000\u0005ᐉ\u0001\u0006ᐉ\u0002\u0007ᐉ\u0003", new Object[]{"c", "h", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new arfc();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (arfc.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
