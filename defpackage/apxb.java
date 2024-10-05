package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apxb extends aonm implements aooz {
    public static final apxb a;
    private static volatile aopf h;
    public int b;
    public aulq c;
    public aqyg d;
    public aqyg e;
    public int f;
    public int g;
    private byte i = 2;

    static {
        apxb apxbVar = new apxb();
        a = apxbVar;
        aonm.registerDefaultInstance(apxb.class, apxbVar);
    }

    private apxb() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0003\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဋ\u0003\u0005ဌ\u0004\u0006ᐉ\u0000", new Object[]{"b", "d", "e", "f", "g", aouo.l, "c"});
            case NEW_MUTABLE_INSTANCE:
                return new apxb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (apxb.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
