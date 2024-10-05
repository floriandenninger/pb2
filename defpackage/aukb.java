package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aukb extends aonm implements aooz {
    public static final aukb a;
    private static volatile aopf j;
    public int b;
    public Object d;
    public avgg e;
    public apxf f;
    public aqyg h;
    public int i;
    private aota k;
    public int c = 0;
    private byte l = 2;
    public aomf g = aomf.b;

    static {
        aukb aukbVar = new aukb();
        a = aukbVar;
        aonm.registerDefaultInstance(aukb.class, aukbVar);
    }

    private aukb() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ည\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ဌ\u0005\u0007ᐼ\u0000\bျ\u0000", new Object[]{"d", "c", "b", "e", "f", "g", "k", "h", "i", avez.a(), arfs.class});
            case NEW_MUTABLE_INSTANCE:
                return new aukb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (aukb.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
