package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awih extends aonm implements aooz {
    public static final awih a;
    public static final aonk b;
    private static volatile aopf i;
    public int c;
    public String d = "";
    public String e;
    public aony f;
    public long g;
    public long h;

    static {
        awih awihVar = new awih();
        a = awihVar;
        aonm.registerDefaultInstance(awih.class, awihVar);
        b = aonm.newSingularGeneratedExtension(aqug.a, awihVar, awihVar, null, 156, aoqn.MESSAGE, awih.class);
    }

    private awih() {
        aomf aomfVar = aomf.b;
        this.e = "";
        this.f = aonm.emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0004\u001a\u0005ဂ\u0003\u0006ဂ\u0004", new Object[]{"c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new awih();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (awih.class) {
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
