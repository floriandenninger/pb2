package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apyj extends aonm implements aooz {
    public static final apyj a;
    private static volatile aopf l;
    public int b;
    public aqyg c;
    public aqyg d;
    public avgg e;
    public apmh f;
    public apmh g;
    public aulq h;
    public aulq j;
    public boolean k;
    private apmh m;
    private aqyg n;
    private byte o = 2;
    public String i = "";

    static {
        apyj apyjVar = new apyj();
        a = apyjVar;
        aonm.registerDefaultInstance(apyj.class, apyjVar);
    }

    private apyj() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0000\t\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0001\u0006ᐉ\u0005\u0007ᐉ\u0006\tᐉ\u0007\u000bဈ\b\fᐉ\t\rဇ\n", new Object[]{"b", "c", "e", "f", "m", "d", "n", "g", "h", "i", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new apyj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (apyj.class) {
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
