package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aocr extends aonm implements aooz {
    public static final aocr a;
    private static volatile aopf i;
    public aocq b;
    public String c = "";
    public aony d = aonm.emptyProtobufList();
    public aony e = aonm.emptyProtobufList();
    public aonu f = emptyIntList();
    public String g = "";
    public int h;
    private boolean j;

    static {
        aocr aocrVar = new aocr();
        a = aocrVar;
        aonm.registerDefaultInstance(aocr.class, aocrVar);
    }

    private aocr() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\b\u0000\u0000\u0001\t\b\u0000\u0003\u0000\u0001\t\u0002Ȉ\u0003Ț\u0004,\u0005Ț\u0006Ȉ\b\u0007\t\f", new Object[]{"b", "c", "d", "f", "e", "g", "j", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aocr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (aocr.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
