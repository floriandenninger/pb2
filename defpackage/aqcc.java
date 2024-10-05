package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqcc extends aonm implements aooz {
    public static final aqcc a;
    private static volatile aopf l;
    public int b;
    public aqyg c;
    public aqyg d;
    public avgg e;
    public avgg f;
    public apxf g;
    public aqyg h;
    public aqyg i;
    public apmh j;
    private apkd m;
    private aqyg n;
    private aota o;
    private byte p = 2;
    public aomf k = aomf.b;

    static {
        aqcc aqccVar = new aqcc();
        a = aqccVar;
        aonm.registerDefaultInstance(aqcc.class, aqccVar);
    }

    private aqcc() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.p);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u000b\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0004\u0004ᐉ\u0005\u0005ᐉ\u0006\u0006ᐉ\t\u0007ᐉ\n\bည\u000b\tᐉ\u0003\nᐉ\u0007\u000bᐉ\b\fᐉ\u0001", new Object[]{"b", "c", "e", "g", "m", "h", "j", "o", "k", "f", "n", "i", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aqcc();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (aqcc.class) {
                        aopfVar = l;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            l = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
