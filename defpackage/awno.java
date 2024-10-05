package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awno extends aonm implements aooz {
    public static final awno a;
    public static final aonk b;
    private static volatile aopf j;
    public int d;
    public int f;
    public int g;
    public int h;
    public apwq i;
    private int k;
    public String c = "";
    public String e = "";

    static {
        awno awnoVar = new awno();
        a = awnoVar;
        aonm.registerDefaultInstance(awno.class, awnoVar);
        b = aonm.newSingularGeneratedExtension(awqd.a, awnoVar, awnoVar, null, 258602976, aoqn.MESSAGE, awno.class);
    }

    private awno() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\f\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဈ\u0002\u0004ဉ\u0006\nဋ\u0003\u000bဋ\u0004\fဋ\u0005", new Object[]{"k", "c", "d", "e", "i", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new awno();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (awno.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
