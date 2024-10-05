package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auvz extends aonm implements aooz {
    public static final auvz a;
    private static volatile aopf f;
    public int b;
    public auvq d;
    public auvq e;
    private aqyg g;
    private aota h;
    private byte i = 2;
    public aony c = emptyProtobufList();

    static {
        auvz auvzVar = new auvz();
        a = auvzVar;
        aonm.registerDefaultInstance(auvz.class, auvzVar);
    }

    private auvz() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0005\u0001Л\u0002ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0004", new Object[]{"b", "c", auvp.class, "d", "e", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new auvz();
            case NEW_BUILDER:
                return new aone((char[]) null, (int[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (auvz.class) {
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
