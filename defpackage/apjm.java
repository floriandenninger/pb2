package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apjm extends aonm implements aooz {
    public static final apjm a;
    private static volatile aopf m;
    public int b;
    public aqyg c;
    public aulq d;
    public avgg e;
    public aqyg f;
    public aqyg g;
    public aqyg h;
    public int i;
    public apxf j;
    public apxf k;
    private aota n;
    private byte o = 2;
    public String l = "";

    static {
        apjm apjmVar = new apjm();
        a = apjmVar;
        aonm.registerDefaultInstance(apjm.class, apjmVar);
    }

    private apjm() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\t\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007င\u0006\bᐉ\b\tᐉ\u0007\nᐉ\t\u000bဈ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "n", "j", "k", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new apjm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (apjm.class) {
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
