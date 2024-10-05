package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqym extends aonm implements aooz {
    public static final aqym a;
    private static volatile aopf m;
    public int b;
    public boolean c;
    public boolean d;
    public aqyg e;
    public aqyg f;
    public aqyg g;
    public aqyg h;
    public int i;
    public apxf j;
    public ashb k;
    private aota n;
    private byte o = 2;
    public aomf l = aomf.b;

    static {
        aqym aqymVar = new aqym();
        a = aqymVar;
        aonm.registerDefaultInstance(aqym.class, aqymVar);
    }

    private aqym() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.o);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0006\u0001ဇ\u0000\u0002ဇ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0007\u0007ᐉ\t\bည\n\tဉ\b\nᐉ\u0005\u000bဌ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "j", "n", "l", "k", "h", "i", aquw.u});
            case NEW_MUTABLE_INSTANCE:
                return new aqym();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (aqym.class) {
                        aopfVar = m;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            m = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
