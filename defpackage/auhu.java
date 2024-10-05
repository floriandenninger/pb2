package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auhu extends aonm implements aooz {
    public static final auhu a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private aqyg f;
    private aulq g;
    private apxf h;
    private apxf i;
    private atdf j;
    private aoxy k;
    private aota l;
    private aulq m;
    private aulq n;
    private byte o = 2;

    static {
        auhu auhuVar = new auhu();
        a = auhuVar;
        aonm.registerDefaultInstance(auhu.class, auhuVar);
    }

    private auhu() {
        emptyProtobufList();
        emptyProtobufList();
        aomf aomfVar = aomf.b;
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0003\u0013\u000b\u0000\u0000\u000b\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\nᐉ\b\u000bᐉ\t\fᐉ\n\u0011ᐉ\u0007\u0012ᐉ\u000e\u0013ᐉ\u000f", new Object[]{"c", "d", "e", "f", "g", "h", "j", "k", "l", "i", "m", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new auhu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (auhu.class) {
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
