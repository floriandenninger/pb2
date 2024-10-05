package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apug extends aonm implements aooz {
    public static final aonv a = new uct(12);
    public static final apug b;
    private static volatile aopf m;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    private aqyg n;
    private aota o;
    private byte p = 2;
    public aonu k = emptyIntList();
    public aomf l = aomf.b;

    static {
        apug apugVar = new apug();
        b = apugVar;
        aonm.registerDefaultInstance(apug.class, apugVar);
    }

    private apug() {
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
                return newMessageInfo(b, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0002\u0001ᐉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ᐉ\b\u0005ည\t\u0006ဇ\u0006\u0007ဇ\u0007\bဇ\u0003\tဇ\u0005\nဇ\u0004\u000b,", new Object[]{"c", "n", "d", "e", "o", "l", "i", "j", "f", "h", "g", "k", atrx.a()});
            case NEW_MUTABLE_INSTANCE:
                return new apug();
            case NEW_BUILDER:
                return new aone(b);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (apug.class) {
                        aopfVar = m;
                        if (aopfVar == null) {
                            aopfVar = new aonf(b);
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
