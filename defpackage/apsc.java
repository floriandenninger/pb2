package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apsc extends aonm implements aooz {
    public static final apsc a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private aqyg f;
    private aqyg g;
    private apsd h;
    private aqyg i;
    private aqyg j;
    private apmh k;
    private byte l = 2;

    static {
        apsc apscVar = new apsc();
        a = apscVar;
        aonm.registerDefaultInstance(apsc.class, apscVar);
    }

    private apsc() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0002\u0006ᐉ\t\u0007ᐉ\u0004\tᐉ\u0006\nᐉ\u0007\u000bᐉ\b", new Object[]{"c", "d", "e", "f", "k", "g", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new apsc();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (apsc.class) {
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
