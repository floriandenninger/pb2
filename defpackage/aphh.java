package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aphh extends aonm implements aooz {
    public static final aphh a;
    private static volatile aopf f;
    public int b;
    public apxf c;
    public boolean d;
    public boolean e;
    private aota g;
    private byte h = 2;

    static {
        aphh aphhVar = new aphh();
        a = aphhVar;
        aonm.registerDefaultInstance(aphh.class, aphhVar);
    }

    private aphh() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0005ᐉ\u0004", new Object[]{"b", "c", "d", "e", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aphh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aphh.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
