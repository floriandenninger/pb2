package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aucn extends aonm implements aooz {
    public static final aucn a;
    private static volatile aopf e;
    public int b;
    public apxf c;
    private aqyg f;
    private apxf g;
    private aqyg h;
    private aqyg i;
    private aota j;
    private byte k = 2;
    public aony d = emptyProtobufList();

    static {
        aucn aucnVar = new aucn();
        a = aucnVar;
        aonm.registerDefaultInstance(aucn.class, aucnVar);
    }

    private aucn() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004Л\u0005ᐉ\u0005\u0007ᐉ\u0003\bᐉ\u0004", new Object[]{"b", "f", "c", "g", "d", auco.class, "j", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new aucn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aucn.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
