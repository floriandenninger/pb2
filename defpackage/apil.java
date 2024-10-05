package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apil extends aonm implements aooz {
    public static final apil a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private apmh e;
    private aqyg f;
    private apmh g;
    private aqyg h;
    private aqyg i;
    private aqyg j;
    private aqyg k;
    private apin l;
    private aqyg m;
    private aqyg n;
    private aota o;
    private byte p = 2;

    static {
        apil apilVar = new apil();
        a = apilVar;
        aonm.registerDefaultInstance(apil.class, apilVar);
    }

    private apil() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0002\u000e\f\u0000\u0000\f\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bᐉ\n\fᐉ\u000b\u000eᐉ\r", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new apil();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (apil.class) {
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
