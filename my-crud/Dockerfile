FROM mcr.microsoft.com/mssql/server:2022-latest

USER root

RUN mkdir /var/opt/sqlserver
RUN mkdir /var/opt/sqlserver/data
RUN mkdir /var/opt/sqlserver/log
RUN mkdir /var/opt/sqlserver/backup

RUN chown -R mssql /var/opt/sqlserver

USER mssql

EXPOSE 1433

CMD /opt/mssql/bin/sqlservr