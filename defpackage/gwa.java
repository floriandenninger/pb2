package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.apps.youtube.app.extensions.accountlinking.UriFlowActivity;
import com.google.protos.youtube.api.innertube.CommandExecutorCommandOuterClass$CommandExecutorCommand;
import com.google.protos.youtube.api.innertube.CreateGpgProfileCommand$CreateGPGProfileCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gwa implements aaha {
    public final Activity a;
    public final gwt b;
    public final aahd c;
    private final afsy d;
    private final wcf e;

    public gwa(Activity activity, gwt gwtVar, wcf wcfVar, afsy afsyVar, aahd aahdVar) {
        this.a = activity;
        this.b = gwtVar;
        this.e = wcfVar;
        this.d = afsyVar;
        this.c = aahdVar;
    }

    public static apxf b(CommandExecutorCommandOuterClass$CommandExecutorCommand commandExecutorCommandOuterClass$CommandExecutorCommand) {
        aong aongVar = (aong) apxf.a.createBuilder();
        aongVar.e(CommandExecutorCommandOuterClass$CommandExecutorCommand.commandExecutorCommand, commandExecutorCommandOuterClass$CommandExecutorCommand);
        return (apxf) aongVar.build();
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        Account account;
        apxfVar.getClass();
        final CreateGpgProfileCommand$CreateGPGProfileCommand createGpgProfileCommand$CreateGPGProfileCommand = (CreateGpgProfileCommand$CreateGPGProfileCommand) apxfVar.pX(CreateGpgProfileCommand$CreateGPGProfileCommand.createGpgProfileCommand);
        try {
            account = this.e.a(this.d.c());
        } catch (RemoteException | qnk | qnl e) {
            zga.d("exception occurred while trying to get account", e);
            account = null;
        }
        if (account == null) {
            aahd aahdVar = this.c;
            CommandExecutorCommandOuterClass$CommandExecutorCommand commandExecutorCommandOuterClass$CommandExecutorCommand = createGpgProfileCommand$CreateGPGProfileCommand.d;
            if (commandExecutorCommandOuterClass$CommandExecutorCommand == null) {
                commandExecutorCommandOuterClass$CommandExecutorCommand = CommandExecutorCommandOuterClass$CommandExecutorCommand.a;
            }
            aahdVar.b(commandExecutorCommandOuterClass$CommandExecutorCommand.b);
            return;
        }
        gwt gwtVar = this.b;
        Uri parse = Uri.parse(createGpgProfileCommand$CreateGPGProfileCommand.b);
        gwtVar.b = Long.toString(gwtVar.a.nextLong());
        ayps z = afsu.a(this.a, account, parse.buildUpon().appendQueryParameter("token", gwtVar.b).build().toString()).G(azre.c()).z(ayqr.a());
        final int i = 1;
        final int i2 = 0;
        z.V(new ayrs(this) { // from class: gvz
            public final /* synthetic */ gwa a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i == 0) {
                    gwa gwaVar = this.a;
                    CreateGpgProfileCommand$CreateGPGProfileCommand createGpgProfileCommand$CreateGPGProfileCommand2 = createGpgProfileCommand$CreateGPGProfileCommand;
                    zga.d("Couldn't launch GPG profile flow.", (Throwable) obj);
                    aahd aahdVar2 = gwaVar.c;
                    CommandExecutorCommandOuterClass$CommandExecutorCommand commandExecutorCommandOuterClass$CommandExecutorCommand2 = createGpgProfileCommand$CreateGPGProfileCommand2.d;
                    if (commandExecutorCommandOuterClass$CommandExecutorCommand2 == null) {
                        commandExecutorCommandOuterClass$CommandExecutorCommand2 = CommandExecutorCommandOuterClass$CommandExecutorCommand.a;
                    }
                    aahdVar2.b(commandExecutorCommandOuterClass$CommandExecutorCommand2.b);
                    return;
                }
                gwa gwaVar2 = this.a;
                CreateGpgProfileCommand$CreateGPGProfileCommand createGpgProfileCommand$CreateGPGProfileCommand3 = createGpgProfileCommand$CreateGPGProfileCommand;
                gwt gwtVar2 = gwaVar2.b;
                Activity activity = gwaVar2.a;
                Uri parse2 = Uri.parse((String) obj);
                CommandExecutorCommandOuterClass$CommandExecutorCommand commandExecutorCommandOuterClass$CommandExecutorCommand3 = createGpgProfileCommand$CreateGPGProfileCommand3.c;
                if (commandExecutorCommandOuterClass$CommandExecutorCommand3 == null) {
                    commandExecutorCommandOuterClass$CommandExecutorCommand3 = CommandExecutorCommandOuterClass$CommandExecutorCommand.a;
                }
                apxf b = gwa.b(commandExecutorCommandOuterClass$CommandExecutorCommand3);
                CommandExecutorCommandOuterClass$CommandExecutorCommand commandExecutorCommandOuterClass$CommandExecutorCommand4 = createGpgProfileCommand$CreateGPGProfileCommand3.d;
                if (commandExecutorCommandOuterClass$CommandExecutorCommand4 == null) {
                    commandExecutorCommandOuterClass$CommandExecutorCommand4 = CommandExecutorCommandOuterClass$CommandExecutorCommand.a;
                }
                apxf b2 = gwa.b(commandExecutorCommandOuterClass$CommandExecutorCommand4);
                CommandExecutorCommandOuterClass$CommandExecutorCommand commandExecutorCommandOuterClass$CommandExecutorCommand5 = createGpgProfileCommand$CreateGPGProfileCommand3.e;
                if (commandExecutorCommandOuterClass$CommandExecutorCommand5 == null) {
                    commandExecutorCommandOuterClass$CommandExecutorCommand5 = CommandExecutorCommandOuterClass$CommandExecutorCommand.a;
                }
                apxf b3 = gwa.b(commandExecutorCommandOuterClass$CommandExecutorCommand5);
                gwtVar2.c = b;
                gwtVar2.d = b2;
                gwtVar2.e = b3;
                gwtVar2.f = activity.getClass().getName();
                Intent intent = new Intent(activity, (Class<?>) UriFlowActivity.class);
                intent.putExtra("URL_EXTRA", parse2.toString());
                intent.putExtra("TOKEN_EXTRA", gwtVar2.b);
                activity.startActivity(intent);
            }
        }, new ayrs(this) { // from class: gvz
            public final /* synthetic */ gwa a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 == 0) {
                    gwa gwaVar = this.a;
                    CreateGpgProfileCommand$CreateGPGProfileCommand createGpgProfileCommand$CreateGPGProfileCommand2 = createGpgProfileCommand$CreateGPGProfileCommand;
                    zga.d("Couldn't launch GPG profile flow.", (Throwable) obj);
                    aahd aahdVar2 = gwaVar.c;
                    CommandExecutorCommandOuterClass$CommandExecutorCommand commandExecutorCommandOuterClass$CommandExecutorCommand2 = createGpgProfileCommand$CreateGPGProfileCommand2.d;
                    if (commandExecutorCommandOuterClass$CommandExecutorCommand2 == null) {
                        commandExecutorCommandOuterClass$CommandExecutorCommand2 = CommandExecutorCommandOuterClass$CommandExecutorCommand.a;
                    }
                    aahdVar2.b(commandExecutorCommandOuterClass$CommandExecutorCommand2.b);
                    return;
                }
                gwa gwaVar2 = this.a;
                CreateGpgProfileCommand$CreateGPGProfileCommand createGpgProfileCommand$CreateGPGProfileCommand3 = createGpgProfileCommand$CreateGPGProfileCommand;
                gwt gwtVar2 = gwaVar2.b;
                Activity activity = gwaVar2.a;
                Uri parse2 = Uri.parse((String) obj);
                CommandExecutorCommandOuterClass$CommandExecutorCommand commandExecutorCommandOuterClass$CommandExecutorCommand3 = createGpgProfileCommand$CreateGPGProfileCommand3.c;
                if (commandExecutorCommandOuterClass$CommandExecutorCommand3 == null) {
                    commandExecutorCommandOuterClass$CommandExecutorCommand3 = CommandExecutorCommandOuterClass$CommandExecutorCommand.a;
                }
                apxf b = gwa.b(commandExecutorCommandOuterClass$CommandExecutorCommand3);
                CommandExecutorCommandOuterClass$CommandExecutorCommand commandExecutorCommandOuterClass$CommandExecutorCommand4 = createGpgProfileCommand$CreateGPGProfileCommand3.d;
                if (commandExecutorCommandOuterClass$CommandExecutorCommand4 == null) {
                    commandExecutorCommandOuterClass$CommandExecutorCommand4 = CommandExecutorCommandOuterClass$CommandExecutorCommand.a;
                }
                apxf b2 = gwa.b(commandExecutorCommandOuterClass$CommandExecutorCommand4);
                CommandExecutorCommandOuterClass$CommandExecutorCommand commandExecutorCommandOuterClass$CommandExecutorCommand5 = createGpgProfileCommand$CreateGPGProfileCommand3.e;
                if (commandExecutorCommandOuterClass$CommandExecutorCommand5 == null) {
                    commandExecutorCommandOuterClass$CommandExecutorCommand5 = CommandExecutorCommandOuterClass$CommandExecutorCommand.a;
                }
                apxf b3 = gwa.b(commandExecutorCommandOuterClass$CommandExecutorCommand5);
                gwtVar2.c = b;
                gwtVar2.d = b2;
                gwtVar2.e = b3;
                gwtVar2.f = activity.getClass().getName();
                Intent intent = new Intent(activity, (Class<?>) UriFlowActivity.class);
                intent.putExtra("URL_EXTRA", parse2.toString());
                intent.putExtra("TOKEN_EXTRA", gwtVar2.b);
                activity.startActivity(intent);
            }
        });
    }
}
