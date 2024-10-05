package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arqe extends aonm implements aooz {
    public static final arqe a;
    private static volatile aopf f;
    public arnd b;
    private int g;
    private aqzg h;
    private aota i;
    private byte j = 2;
    public aony c = emptyProtobufList();
    public aony d = emptyProtobufList();
    public aomf e = aomf.b;

    static {
        arqe arqeVar = new arqe();
        a = arqeVar;
        aonm.registerDefaultInstance(arqe.class, arqeVar);
    }

    private arqe() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001̉\u0006\u0000\u0002\u0005\u0001ᐉ\u0000\u0004Л\u0005Л\u000bᐉ\u0002\fည\u0003̉ᐉ\u0001", new Object[]{"g", "b", "c", arqb.class, "d", apxf.class, "i", "e", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new arqe();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (arqe.class) {
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
